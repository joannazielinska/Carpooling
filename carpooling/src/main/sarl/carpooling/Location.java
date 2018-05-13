package carpooling;

public class Location {
	private String locationName;
	private Coords coordinates;
	
	public Location(String locationName)
	{
		this.locationName = locationName;
		//this.coordinates = coords;
	}
	
	public String getLocationName()
	{
		return locationName;
	}
	
	public Coords getCoords()
	{
		return coordinates;
	}
}
