package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.beans.javax.Region;
import com.example.beans.javax.RegionList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java/api/region")
public class RegionController {

	@RequestMapping(value = "/regions", method = RequestMethod.GET, headers="Accept=application/xml")
	public RegionList getCountriess() {
        return createRegionList();
	}

	public RegionList createRegionList() {
		Region indiaCountry=new Region(1, "India");
		Region chinaCountry=new Region(4, "China");
        Region nepalCountry=new Region(3, "Nepal");
        Region bhutanCountry=new Region(2, "Bhutan");

        List listOfRegion = new ArrayList();
        listOfRegion.add(indiaCountry);
        listOfRegion.add(chinaCountry);
        listOfRegion.add(nepalCountry);
        listOfRegion.add(bhutanCountry);
        RegionList regionList = new RegionList();
        regionList.setListOfRegion(listOfRegion);

        return regionList;
	}
}
