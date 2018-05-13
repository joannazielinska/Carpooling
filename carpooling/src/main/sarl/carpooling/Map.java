package carpooling;

import java.util.ArrayList;

public class Map {
	public static ArrayList<Location> cities = new ArrayList<>();
	
	public static void initMap()
	{
		cities.add(new Location("Warszawa"));
		cities.add(new Location("Kraków"));
		cities.add(new Location("Łódź"));
		cities.add(new Location("Wrocław"));
		//cities.add(new Location("Poznań"));
		//cities.add(new Location("Gdańsk"));
		//cities.add(new Location("Szczecin"));
		//cities.add(new Location("Bydgoszcz"));
		//cities.add(new Location("Lublin"));
		//cities.add(new Location("Białystok"));
	}
}
