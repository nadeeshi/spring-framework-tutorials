package com.example.beans.javax;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="region")
public class Region {

private int id;
	
	private String regionName;
	
	public Region() {
		super();
	}

	public Region(int id, String regionName) {
		super();
		this.id = id;
		this.regionName = regionName;
	}

	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}		
	
}
