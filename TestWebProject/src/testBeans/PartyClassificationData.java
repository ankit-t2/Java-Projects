package testBeans;

import java.util.ArrayList;

public class PartyClassificationData {

	ArrayList<String> partyClassificationArrayList;
	
	public void setPartyClassification(ArrayList<String> alPartyClass)
	{
		partyClassificationArrayList = alPartyClass;
	}
	
	public ArrayList<String> getPartyClassification()
	{
		return partyClassificationArrayList;
	}
}
