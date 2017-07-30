package com.tutorialspoint.struts2;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import com.opensymphony.xwork2.ActionSupport;

public class PartyClassification extends ActionSupport{

	String partyClassification;
	HashMap<String,String> partyClassifications = new HashMap<String,String>();

	public String execute() throws Exception {
		return "success";
	}
	
	public HashMap<String,String> getPartyClassifications()
	{
		System.out.println("Inside getPartyClassifications");
		partyClassifications.put("001", "Asset");
		partyClassifications.put("002", "Home Value");
		partyClassifications.put("003", "Credit Turnover");
		partyClassifications.put("004", "LBG Treatment");
		partyClassifications.put("005", "BOS Treatment");
		partyClassifications.put("006", "HAL Treatment");

		
		return partyClassifications;
	}

	public String getPartyClassification()
	{
		System.out.println("Returning " + partyClassification);

		return partyClassification;
	}

	public void setPartyClassification(String argPartyClass)
	{
		System.out.println("Inside setPartyClassification " + argPartyClass);
		partyClassification = argPartyClass;
	}

}
