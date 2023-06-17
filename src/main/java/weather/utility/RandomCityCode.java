package weather.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomCityCode {
	/*
	 * The idList is from the OpenWeather.org file "city.list.json.gz"
	 * http://bulk.openweathermap.org/sample/ Unique identifiers for cities of
	 * different countries. As the APi support for 1 city per request, this
	 * RandomCityCode utility will randomly get the city IDs
	 */

	static ArrayList<Long> idList = new ArrayList<>(Arrays.asList(2917509L,
			2917510L, 2917520L, 2917524L, 2917526L, 2917530L, 2917532L,
			2917539L, 2917540L, 2917542L, 2917544L, 2917578L, 2917579L,
			2917586L, 2917596L, 2917606L, 2917607L, 2917610L, 2917618L, 833L,
			2960L, 3245L, 3530L, 5174L, 7264L, 8084L, 9874L, 11263L, 11754L,
			12795L, 14177L, 14256L, 18007L, 18093L, 18557L, 18918L, 23814L,
			24851L, 6432297L, 6432293L, 6432294L, 6432295L, 6432292L, 6432273L,
			6432274L, 6432275L, 6432276L, 6432277L, 6432278L, 6432279L,
			6432281L, 6432282L, 6432283L, 6432284L, 6432285L, 6432288L,
			6432290L, 6432291L	));

	static Random random = new Random();

	public static long getrandomCityId() {
		int randomIndex = random.nextInt(idList.size());
		return idList.get(randomIndex);
	}

}
