package carpooling;

import java.util.ArrayList;

import io.sarl.lang.core.Address;

public class Utils
{
	public static ArrayList<SingleProposition> GetAllMatched(ArrayList<SingleProposition> matches, SingleProposition match)
	{
		ArrayList<SingleProposition> result = new ArrayList<>();
		result.add(match);
		for(SingleProposition sm : matches)
		{
			if(result.size() == 5) return result;
			if(match.startLocation.getLocationName().equals(sm.startLocation.getLocationName()) && match.destination.getLocationName().equals(sm.destination.getLocationName()) && sm != match) result.add(sm);
		}
		return result;
	}
}
