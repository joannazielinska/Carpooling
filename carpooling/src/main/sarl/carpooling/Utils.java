package carpooling;

import java.util.ArrayList;

import io.sarl.lang.core.Address;

public class Utils
{
	public synchronized static ArrayList<SingleProposition> GetAllMatched(ArrayList<SingleProposition> matches, SingleProposition match)
	{
		
		if(match.personalData.isHeDriver()==1) { // 1 if he is driver
		ArrayList<SingleProposition> result = new ArrayList<>();
		result.add(match);
		
		
		for(SingleProposition sm : matches)
		{/*
			if(result.size() == 100)
			{
				//there has to be at least a driver's license and a car to match ppl
				if(hasCar.personalData.isHasCar() && hasDriverLicense.personalData.isHasDriverLicense()) return result;
				else
				{
					removeOnePerson(result, hasCar, hasDriverLicense);
				}
			}*/
			
			if(sm.personalData.isHeDriver()!=1 && match.startLocation.getLocationName().equals(sm.startLocation.getLocationName()) 
					&& match.destination.getLocationName().equals(sm.destination.getLocationName()) && sm != match) 
			{
				//if(!hasCar.personalData.isHasCar()) hasCar = sm;
				//if(!hasCar.personalData.isHasDriverLicense()) hasDriverLicense = sm;
				result.add(sm);
			}
		}
		//if(hasCar.personalData.isHasCar() && hasDriverLicense.personalData.isHasDriverLicense()) return result;
		return result;
		}
		return null;
	}
	/*
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
	}*/
}
