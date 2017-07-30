package com.tutorialspoint.struts2;

import java.util.ArrayList;

import com.tutorialspoint.beans.SegmentBean;

public class PartyClassificationSegments {

	String partyClassification;
	String partyClassificationNarrative;
	String rangeType;
	ArrayList<SegmentBean> segments = new ArrayList<SegmentBean>();
	
	public String execute() throws Exception {
		System.out.println("PartyClassificationSegments:: Inside Execute");
		
		partyClassificationNarrative = "Asset";
		
		SegmentBean seg1 = new SegmentBean();
		seg1.setPartyClassNarr("Asset");
		seg1.setSegmentID("001");
		seg1.setRangeType("SCORE_RANGE");
		seg1.setRangeStart(10);
		seg1.setRangeEnd(20);
		
		SegmentBean seg2 = new SegmentBean();
		seg2.setPartyClassNarr("Asset");
		seg2.setSegmentID("002");
		seg2.setRangeType("SCORE_RANGE");
		seg2.setRangeStart(20);
		seg2.setRangeEnd(30);
		
		SegmentBean seg3 = new SegmentBean();
		seg3.setPartyClassNarr("Asset");
		seg3.setSegmentID("003");
		seg3.setRangeType("SCORE_RANGE");
		seg3.setRangeStart(40);
		seg3.setRangeEnd(40);
		
		segments.add(seg1);
		segments.add(seg2);
		segments.add(seg3);
		
		return "success";
	}
	
	public String getPartyClassification()
	{
		System.out.println("PartyClassificationSegments :: Returning " + partyClassification);

		return partyClassification;
	}

	public void setPartyClassification(String arg0)
	{
		System.out.println("PartyClassificationSegments :: Inside setPartyClassification " + arg0);
		partyClassification = arg0;
	}

	public String getPartyClassificationNarrative() {
		return partyClassificationNarrative;
	}

	public void setPartyClassificationNarrative(String partyClassificatioNarrative) {
		this.partyClassificationNarrative = partyClassificatioNarrative;
	}

	public String getRangeType()
	{
		System.out.println("PartyClassificationSegments :: Inside getPartyClassification");
		return rangeType;
	}

	public void setRangeType(String arg0)
	{
		System.out.println("PartyClassificationSegments :: Inside getPartyClassification");
		rangeType = arg0;
	}

	public ArrayList<SegmentBean> getSegments()
	{
		System.out.println("PartyClassificationSegments :: Inside getSegments");
		return segments;
	}
	
	public void setSegments(ArrayList<SegmentBean> arg0)
	{
		System.out.println("PartyClassificationSegments :: Inside setSegments");
		segments = arg0;
	}
}
