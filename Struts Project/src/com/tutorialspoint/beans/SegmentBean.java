package com.tutorialspoint.beans;

public class SegmentBean {

	private String partyClassNarr;
	private String segmentID;
	private String rangeType;
	private int rangeStart;
	private int rangeEnd;
	
	public String getPartyClassNarr() {
		return partyClassNarr;
	}
	public void setPartyClassNarr(String partyClassNarr) {
		this.partyClassNarr = partyClassNarr;
	}

	public String getSegmentID() {
		System.out.println("Inside getSegmentID. Returning " + segmentID);
		return segmentID;
	}
	public void setSegmentID(String segmentID) {
		this.segmentID = segmentID;
	}
	
	public String getRangeType() {
		return rangeType;
	}
	public void setRangeType(String rangeType) {
		this.rangeType = rangeType;
	}
	
	public int getRangeStart() {
		return rangeStart;
	}
	public void setRangeStart(int rangeStart) {
		this.rangeStart = rangeStart;
	}
	
	public int getRangeEnd() {
		return rangeEnd;
	}
	public void setRangeEnd(int rangeEnd) {
		this.rangeEnd = rangeEnd;
	}
	
}
