package weather.utility;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

import org.json.JSONObject;

import weather.dto.Weather;

public class CustomMapper {


    private static final Random random = new Random();
    
	public static Weather convertJsontoWeatherDto(JSONObject json) {

		
		String dateTime = dateTimeFormatter(json.getLong("dt"));
		Long id = generateUniqueId(json.getLong("dt"));
		String city = json.getString("name");
		Double temp = json.getJSONObject("main").getDouble("temp");
		Double humidity = json.getJSONObject("main").getDouble("humidity");
		Double feelsLike = json.getJSONObject("main").getDouble("feels_like");
		Double tempMax = json.getJSONObject("main").getDouble("temp_max");
		Double tempMin = json.getJSONObject("main").getDouble("temp_min");
		Double pressure = json.getJSONObject("main").getDouble("pressure");
		String type = json.getJSONArray("weather").getJSONObject(0).getString("main");
		String desc = json.getJSONArray("weather").getJSONObject(0).getString("description");
		Double longitude = json.getJSONObject("coord").getDouble("lon");
		Double latitude = json.getJSONObject("coord").getDouble("lat");
		Double visibility = json.getDouble("visibility");
		Double windSpeed = json.getJSONObject("wind").getDouble("speed");
		Double clouds = json.getJSONObject("clouds").getDouble("all");
		Double sunRise = json.getJSONObject("sys").getDouble("sunrise");
		Double sunSet = json.getJSONObject("sys").getDouble("sunset");
		String country = json.getJSONObject("sys").getString("country");

		return new Weather(id, temp, humidity, longitude, latitude, type, desc,
				feelsLike, tempMin, tempMax, pressure, visibility, windSpeed, clouds, sunRise, sunSet, country, city, dateTime);

	}
	
	static String dateTimeFormatter(Long instant){
		
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.ofEpochSecond(instant), ZoneId.of("UTC"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
//		System.out.println(instant +" -> "+formatter.format(zonedDateTime));
		return formatter.format(zonedDateTime);
	}
	
	static Long generateUniqueId(Long instant){
		
		return instant + (System.currentTimeMillis() % 1000L) +  random.nextInt(999999); 
	}
}
