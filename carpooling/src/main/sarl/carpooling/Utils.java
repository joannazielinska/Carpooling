package carpooling;

import java.util.ArrayList;

import io.sarl.lang.core.Address;

public class Utils
{
	public synchronized static ArrayList<SingleProposition> GetAllMatched(ArrayList<SingleProposition> matches, SingleProposition match)
	{
		ArrayList<SingleProposition> result = new ArrayList<>();
		result.add(match);
		SingleProposition hasCar = match;
		SingleProposition hasDriverLicense = match;
		
		for(SingleProposition sm : matches)
		{
			if(result.size() == 5)
			{
				//there has to be at least a driver's license and a car to match ppl
				if(hasCar.personalData.isHasCar() && hasDriverLicense.personalData.isHasDriverLicense()) return result;
				else
				{
					removeOnePerson(result, hasCar, hasDriverLicense);
				}
			}
			
			if(match.startLocation.getLocationName().equals(sm.startLocation.getLocationName()) 
					&& match.destination.getLocationName().equals(sm.destination.getLocationName()) && sm != match) 
			{
				if(!hasCar.personalData.isHasCar()) hasCar = sm;
				if(!hasCar.personalData.isHasDriverLicense()) hasDriverLicense = sm;
				result.add(sm);
			}
		}
		if(hasCar.personalData.isHasCar() && hasDriverLicense.personalData.isHasDriverLicense()) return result;
		return null;
	}
	
	private synchronized static void removeOnePerson(ArrayList<SingleProposition> result, SingleProposition hasCar, SingleProposition hasDriverLicense)
	{
		for(SingleProposition sp : result)
		{
			if(!hasCar.personalData.isHasCar() && !hasDriverLicense.personalData.isHasDriverLicense())
			{
				result.remove(sp);
				return;
			}
			if(hasCar.personalData.isHasCar() && hasCar != sp)
			{
				result.remove(sp);
				return;
			}
			if(hasDriverLicense.personalData.isHasDriverLicense() && hasDriverLicense != sp)
			{
				result.remove(sp);
				return;
			}
		}
	}
}
