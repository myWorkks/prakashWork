package com.supportwork;

import java.util.ArrayList;
import java.util.List;

public class DB {
	public List<String> states() {
		List<String> indianStates = new ArrayList<String>();
		indianStates.add("Andhra Pradesh");
		indianStates.add("Arunachal Pradesh");
		indianStates.add("Assam");
		indianStates.add("Bihar");
		indianStates.add("Chhattisgarh");
		return indianStates;

	}

	public List<String> APdistricts() {
		List<String> andhraPradeshDistricts = new ArrayList<>();

		andhraPradeshDistricts.add("Anantapur");
		andhraPradeshDistricts.add("Chittoor");
		andhraPradeshDistricts.add("East Godavari");
		andhraPradeshDistricts.add("Guntur");
		andhraPradeshDistricts.add("Krishna");
		andhraPradeshDistricts.add("Kurnool");
		andhraPradeshDistricts.add("Nellore");
		andhraPradeshDistricts.add("Prakasam");
		andhraPradeshDistricts.add("Srikakulam");
		return andhraPradeshDistricts;
	}

	public List<String> arunachalPDistricts() {
		List<String> arunachalPradeshDistricts = new ArrayList<>();
		arunachalPradeshDistricts.add("Tawang");
		arunachalPradeshDistricts.add("West Kameng");
		arunachalPradeshDistricts.add("East Kameng");
		arunachalPradeshDistricts.add("Papum Pare");
		arunachalPradeshDistricts.add("Kurung Kumey");
		arunachalPradeshDistricts.add("Kra Daadi");
		return arunachalPradeshDistricts;
	}

	public List<String> assamDistricts() {
		List<String> assamDistricts = new ArrayList<>();

		assamDistricts.add("Baksa");
		assamDistricts.add("Barpeta");
		assamDistricts.add("Biswanath");
		assamDistricts.add("Bongaigaon");
		assamDistricts.add("Cachar");
		assamDistricts.add("Charaideo");
		return assamDistricts;
	}

	// pincodes
	public List<String> anatapurPincodes() {
		List<String> anantapurPincodes = new ArrayList<>();

		anantapurPincodes.add("515001");
		anantapurPincodes.add("515002");
		anantapurPincodes.add("515003");
		anantapurPincodes.add("515004");
		return anantapurPincodes;
	}

	public List<String> chittorPincodes() {
		List<String> chittoorPincodes = new ArrayList<>();

		chittoorPincodes.add("517001");
		chittoorPincodes.add("517002");
		chittoorPincodes.add("517003");
		chittoorPincodes.add("517004");
		return chittoorPincodes;
	}

	public List<String> eastGodavariPinodes() {
		List<String> eastGodavariPincodes = new ArrayList<>();

		eastGodavariPincodes.add("533001");
		eastGodavariPincodes.add("533002");
		eastGodavariPincodes.add("533003");
		eastGodavariPincodes.add("533004");
		eastGodavariPincodes.add("533005");
		return eastGodavariPincodes;
	}

	// aruncahalpradesh
	public List<String> tawangPincodes() {
		List<String> tawangPincodes = new ArrayList<>();

		tawangPincodes.add("790104");
		tawangPincodes.add("790105");
		tawangPincodes.add("790106");
		return tawangPincodes;
	}

	public List<String> westKamengPincodes() {
		List<String> westKamengPincodes = new ArrayList<>();

		westKamengPincodes.add("790101");
		westKamengPincodes.add("790102");
		westKamengPincodes.add("790103");
		return westKamengPincodes;
	}

	public List<String> kradaiPincodes() {
		List<String> kraDaadiPincodes = new ArrayList<>();

		kraDaadiPincodes.add("791001");
		kraDaadiPincodes.add("791002");
		kraDaadiPincodes.add("791003");
		return kraDaadiPincodes;
	}

	public List<String> baskaPincodes() {
		List<String> baksaPincodes = new ArrayList<>();

		baksaPincodes.add("781301");
		baksaPincodes.add("781302");
		baksaPincodes.add("781303");
		return baksaPincodes;
	}

	public List<String> barpetaPincodes() {
		List<String> barpetaPincodes = new ArrayList<>();

		barpetaPincodes.add("781301");
		barpetaPincodes.add("781302");
		barpetaPincodes.add("781303");
		return barpetaPincodes;
	}

	public List<String> chacharPincodes() {
		List<String> cacharPincodes = new ArrayList<>();

		cacharPincodes.add("788001");
		cacharPincodes.add("788002");
		cacharPincodes.add("788003");
		return cacharPincodes;
	}
}
