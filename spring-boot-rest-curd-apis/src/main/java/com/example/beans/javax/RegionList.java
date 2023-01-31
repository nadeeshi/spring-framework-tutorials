package com.example.beans.javax;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "region-list")
public class RegionList {

	List listOfRegion;
	
	public RegionList() {
		super();
	}

	public RegionList(List listOfRegion) {
		super();
		this.listOfRegion = listOfRegion;
	}

	public List getListOfRegion() {
		return listOfRegion;
	}

	@XmlElement(name = "region")
	public void setListOfRegion(List listOfRegion) {
		this.listOfRegion = listOfRegion;
	}
	
	
}
