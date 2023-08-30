package com.supportwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
	public void countriesTillPincode() {
		Map<String, List<Map<String, List<Map<String, List<String>>>>>> pincodes = new HashMap<String, List<Map<String, List<Map<String, List<String>>>>>>();
		List<Map<String, List<String>>> pinCodeList = new ArrayList<Map<String, List<String>>>();
		Map<String, List<String>> p = new HashMap<String, List<String>>();
		List<String> pincodesHyderabad = new ArrayList<>();
		pincodesHyderabad.add("500001");
		pincodesHyderabad.add("500002");
		pincodesHyderabad.add("500003");
		pincodesHyderabad.add("500004");
		pincodesHyderabad.add("500005");
		p.put("Hyderbad", pincodesHyderabad);
		pinCodeList.add(p); 
		List<String> pincodesWarangal = new ArrayList<>();
		pincodesWarangal.add("506001");
		pincodesWarangal.add("506002");
		pincodesWarangal.add("506003");
		pincodesWarangal.add("506004");
		pincodesWarangal.add("506005");
		
		
	}

	public Map<String, List<String>> countriesAndStates() {

		Map<String, List<String>> countriesAndStates = new HashMap<String, List<String>>();

		List<String> indianStates = new ArrayList<>();
		indianStates.add("Andhra Pradesh");
		indianStates.add("Telangana");
		countriesAndStates.put("India", indianStates);
		return countriesAndStates;

	}

	public Map<String, List<String>> statesAndCities() {
		Map<String, List<String>> statesAndDistricts = new HashMap<String, List<String>>();
		List<String> districtNames = new ArrayList<>();
		districtNames.add("Siddipet");
		districtNames.add("Warangal");
		districtNames.add("Karimnagar");
		districtNames.add("Hyderabad");

		List<String> apCities = new ArrayList<>();
		apCities.add("Tirupathi");
		apCities.add("Visakhapatnam");
		apCities.add("Vijayawada");

		statesAndDistricts.put("Telangana", districtNames);
		statesAndDistricts.put("AndhraPradesh", apCities);
		return statesAndDistricts;
	}

	public void districtAndPincode() {

		Map<String, List<String>> districtsAndPincodes = new HashMap<String, List<String>>();

		List<String> pincodesHyderabad = new ArrayList<>();
		pincodesHyderabad.add("500001");
		pincodesHyderabad.add("500002");
		pincodesHyderabad.add("500003");
		pincodesHyderabad.add("500004");
		pincodesHyderabad.add("500005");

		List<String> pincodesKarimnagar = new ArrayList<>();
		pincodesKarimnagar.add("505001");
		pincodesKarimnagar.add("505002");
		pincodesKarimnagar.add("505003");
		pincodesKarimnagar.add("505004");
		pincodesKarimnagar.add("505005");

		List<String> pincodesWarangal = new ArrayList<>();
		pincodesWarangal.add("506001");
		pincodesWarangal.add("506002");
		pincodesWarangal.add("506003");
		pincodesWarangal.add("506004");
		pincodesWarangal.add("506005");

		List<String> pincodesSiddipet = new ArrayList<>();
		pincodesSiddipet.add("502103");
		pincodesSiddipet.add("502110");
		pincodesSiddipet.add("502116");
		pincodesSiddipet.add("502122");
		pincodesSiddipet.add("502224");

		List<String> pincodesTirupati = new ArrayList<>();
		pincodesTirupati.add("517501");
		pincodesTirupati.add("517502");
		pincodesTirupati.add("517503");
		pincodesTirupati.add("517504");
		pincodesTirupati.add("517505");

		List<String> pincodesVizag = new ArrayList<>();
		pincodesVizag.add("530001");
		pincodesVizag.add("530002");
		pincodesVizag.add("530003");
		pincodesVizag.add("530004");
		pincodesVizag.add("530005");

		List<String> pincodesVijayawada = new ArrayList<>();
		pincodesVijayawada.add("520001");
		pincodesVijayawada.add("520002");
		pincodesVijayawada.add("520003");
		pincodesVijayawada.add("520004");
		pincodesVijayawada.add("520005");

		districtsAndPincodes.put("Hyderabad", pincodesHyderabad);
		districtsAndPincodes.put("Warangal", pincodesWarangal);
		districtsAndPincodes.put("Karimnagar", pincodesKarimnagar);
		districtsAndPincodes.put("Siddipet", pincodesSiddipet);
		districtsAndPincodes.put("Tirupathi", pincodesTirupati);
		districtsAndPincodes.put("Vizag", pincodesVizag);
		districtsAndPincodes.put("Vijayawada", pincodesVijayawada);

	}
}
