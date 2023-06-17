package weather.dto;

import java.io.Serializable;


public class Weather implements Serializable {


    
    private static final long serialVersionUID = 123L;
    Long id;
	Double temp;
	Double humidity;
	Double lon;
	Double lat;
	String type;
	String country;
	String description;
	Double feelsLike;
	Double tempMin;
	Double tempMax;
	Double pressure;
	Double visibility;
	Double windSpeed;
	Double clouds;
	Double sunRise;
	Double sunSet;
	String dateTime;
	String city;
	
	public Weather() {
	}
	
	
	public Double getLon() {
		return lon;
	}


	public void setLon(Double lon) {
		this.lon = lon;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDateTime() {
		return dateTime;
	}


	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Double getLat() {
		return lat;
	}


	public void setLat(Double lat) {
		this.lat = lat;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDesc() {
		return description;
	}


	public void setDesc(String desc) {
		this.description = desc;
	}


	public Double getFeelsLike() {
		return feelsLike;
	}


	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}


	public Double getTempMin() {
		return tempMin;
	}


	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}


	public Double getTempMax() {
		return tempMax;
	}


	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}


	public Double getPressure() {
		return pressure;
	}


	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}
	
	public String getCountry(){
		return this.country;
	}
	
	public void setCountry(String country){
		this.country = country;
	}


	public Double getVisibility() {
		return visibility;
	}


	public void setVisibility(Double visibility) {
		this.visibility = visibility;
	}


	public Double getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}


	public Double getClouds() {
		return clouds;
	}


	public void setClouds(Double clouds) {
		this.clouds = clouds;
	}


	public Double getSunRise() {
		return sunRise;
	}


	public void setSunRise(Double sunRise) {
		this.sunRise = sunRise;
	}


	public Double getSunSet() {
		return sunSet;
	}


	public void setSunSet(Double sunSet) {
		this.sunSet = sunSet;
	}


	public Weather(Long id, Double temp, Double humidity, Double lon, Double lat,
			String main, String desc, Double feelsLike, Double tempMin,
			Double tempMax, Double pressure, Double visibility, Double windSpeed,
			Double clouds, Double sunRise, Double sunSet, String country, String city, String dateTime) {
		super();
		this.id = id;
		this.temp = temp;
		this.humidity = humidity;
		this.lon = lon;
		this.lat = lat;
		this.type = main;
		this.description = desc;
		this.feelsLike = feelsLike;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.pressure = pressure;
		this.visibility = visibility;
		this.windSpeed = windSpeed;
		this.clouds = clouds;
		this.sunRise = sunRise;
		this.sunSet = sunSet;
		this.country = country;
		this.city = city;
		this.dateTime = dateTime;
	}


	public Weather(Double temperature, Double humidity) {
		// TODO Auto-generated constructor stub
		this.temp = temperature;
		this.humidity = humidity;
	}
	public Double getTemp() {
		return temp;
	}
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	public Double getHumidity() {
		return humidity;
	}
	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}
	
	
	@Override
	public String toString() {
	    return "{"

	        + "\"id\":" + id
	        + ", \"temp\":" + temp 
	        + ", \"humidity\":" + humidity 
	        + ", \"lon\":" + lon 
	        + ", \"lat\":" + lat 
	        + ", \"type\":\"" + type + "\""
	        + ", \"description\":\"" + description + "\""
	        + ", \"feelsLike\":" + feelsLike 
	        + ", \"tempMin\":" + tempMin 
	        + ", \"tempMax\":" + tempMax 
	        + ", \"pressure\":" + pressure 
	        + ", \"country\":" + country 
	        + ", \"visibility\":" + visibility 
	        + ", \"windSpeed\":" + windSpeed 
	        + ", \"clouds\":" + clouds 
	        + ", \"sunRise\":" + sunRise 
	        + ", \"sunSet\":" + sunSet 
	        + ", \"city\":" + city
	        + ", \"dateTime\":" + dateTime  
	        + "}";
	}


	

}
