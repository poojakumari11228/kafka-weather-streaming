package weather.config;

public enum OpenWeatherConfig {
	KEY(""),
	API_ENDPOINT("https://api.openweathermap.org/data/2.5/weather?id=");
	
	public final String value;

	private OpenWeatherConfig(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
