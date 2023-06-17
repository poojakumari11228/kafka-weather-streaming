package weather.producer;

import org.apache.kafka.clients.producer.*;
import org.json.*;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import weather.config.OpenWeatherConfig;
import weather.config.WeatherProducerConfig;
import weather.dto.Weather;
import weather.utility.CustomMapper;
import weather.utility.RandomCityCode;

import java.io.*;
import java.net.*;
import java.util.Properties;

public class WeatherProducer {
	private static final String TOPIC_NAME = "weather-data";
	private static final String API_ENDPOINT = OpenWeatherConfig.API_ENDPOINT.value;
	private static final int INTERVAL_MS = 5000; 

	public static void main(String[] args) throws Exception {

		Properties props = new WeatherProducerConfig().getProperties();

		Producer<String, String> producer = new KafkaProducer<>(props);

		while (true) {
			Long cityId = RandomCityCode.getrandomCityId();

			System.out.println("Producing - weather stream");
			URL url  = new URL(OpenWeatherConfig.API_ENDPOINT.value + cityId  +  OpenWeatherConfig.KEY.value);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			con.disconnect();
			
			JSONObject jsonObject = new JSONObject(content.toString());

			Weather weather = CustomMapper.convertJsontoWeatherDto(jsonObject);
			
		
			ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC_NAME, cityId+"", weather.toString());

			producer.send(record);
			Thread.sleep(INTERVAL_MS);
		}

	}
}
