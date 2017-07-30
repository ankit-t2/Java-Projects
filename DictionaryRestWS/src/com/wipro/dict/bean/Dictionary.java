package com.wipro.dict.bean;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="dictionary",propOrder={"term","definition"})
public class Dictionary {

	String term;
	String definition;
	
	public Dictionary() {

	}

	public Dictionary(String term, String definition) {

		this.term = term;
		this.definition = definition;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

}
