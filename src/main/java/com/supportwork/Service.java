package com.supportwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
//getting data
	private DB db = new DB();

	public Map<String, List<Map<String, List<String>>>> getAPPincodeData() {
		Map<String, List<Map<String, List<String>>>> tsmap = new HashMap<String, List<Map<String, List<String>>>>();
		List<Map<String, List<String>>> tsDistrictsAndPincodes = new ArrayList<Map<String, List<String>>>();
		List<String> anaPincodes = db.anatapurPincodes();
		Map<String, List<String>> anatapurDistAndPincodes = new HashMap<String, List<String>>();
		anatapurDistAndPincodes.put("Anantapur", anaPincodes);
		List<String> chittorPincodes = db.chittorPincodes();
		Map<String, List<String>> chitorAndPincodes = new HashMap<String, List<String>>();
		chitorAndPincodes.put("Chittor", chittorPincodes);
		Map<String, List<String>> eastGodavariPincodes = new HashMap<String, List<String>>();
		eastGodavariPincodes.put("East Godavari", db.eastGodavariPinodes());
		tsDistrictsAndPincodes.add(eastGodavariPincodes);
		tsDistrictsAndPincodes.add(chitorAndPincodes);
		tsDistrictsAndPincodes.add(anatapurDistAndPincodes);
		tsmap.put("Andhra Pradesh", tsDistrictsAndPincodes);
		return tsmap;
	}

	
	public Map<String, List<Map<String, List<String>>>> getArunaPPincodeData() {
		Map<String, List<Map<String, List<String>>>> arunamap = new HashMap<String, List<Map<String, List<String>>>>();

		List<Map<String, List<String>>> list = new ArrayList<Map<String, List<String>>>();
		Map<String, List<String>> d1 = new HashMap<String, List<String>>();
		d1.put("Tawang", db.tawangPincodes());
		Map<String, List<String>> d2 = new HashMap<String, List<String>>();
		d2.put("West Kampeng", db.westKamengPincodes());
		Map<String, List<String>> d3 = new HashMap<String, List<String>>();
		d3.put("Kradadi", db.kradaiPincodes());
		list.add(d3);
		list.add(d2);
		list.add(d1);
		arunamap.put("Arunachal Pradesh", list);
		return arunamap;
	}

	public Map<String, List<Map<String, List<String>>>> getBiharPPincodeData() {
		Map<String, List<Map<String, List<String>>>> biharamap = new HashMap<String, List<Map<String, List<String>>>>();
		List<Map<String, List<String>>> l = new ArrayList<Map<String, List<String>>>();
		Map<String, List<String>> d1 = new HashMap<String, List<String>>();
		d1.put("Baska", db.baskaPincodes());
		Map<String, List<String>> d2 = new HashMap<String, List<String>>();
		d2.put("Barpeta", db.barpetaPincodes());
		Map<String, List<String>> d3 = new HashMap<String, List<String>>();
		d3.put("Chachar", db.chacharPincodes());
		l.add(d3);
		l.add(d2);
		l.add(d1);
		biharamap.put("Bihar", l);
		return biharamap;
	}

	public Map<String, List<Map<String, List<Map<String, List<String>>>>>> getIndianPincodeData() {
		Map<String, List<Map<String, List<String>>>> d1 = getArunaPPincodeData();
		Map<String, List<Map<String, List<String>>>> d2 = getAPPincodeData();
		Map<String, List<Map<String, List<String>>>> d3 = getBiharPPincodeData();
		List<Map<String, List<Map<String, List<String>>>>> l = new ArrayList<Map<String, List<Map<String, List<String>>>>>();
		l.add(d3);
		l.add(d2);
		l.add(d1);

		Map<String, List<Map<String, List<Map<String, List<String>>>>>> m = new HashMap<String, List<Map<String, List<Map<String, List<String>>>>>>();
		m.put("India", l);
		return m;
	}

}
