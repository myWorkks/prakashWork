package com.supportwork;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class LogicService {
	private Service s = new Service();

	private boolean stateCheck = true;
	String stateKey = "";

	public void validPincode(List<String> pincodes, String country, String state, String district, String pincode) {
		for (String s : pincodes) {
			if (s.equals(pincode)) {
				System.out.println(country + "to" + pincode);
			}
		}
	}

	public void validDistrict(List<Map<String, List<String>>> districts, String country, String state, String district,
			String pincode) throws Exception {
		// System.out.println("valid district");
		for (Map<String, List<String>> map : districts) {
			// System.out.println(map);
			Set<String> d = map.keySet();
			if (d.contains(district))
			// throw new Exception(country + "->" + state + "->" + "Invalid " + district);
			{
				System.out.println(district);
				List<String> pincodes = map.get(district);
				validPincode(pincodes, country, state, district, pincode);
			}
		}
	}

	public void validState(List<Map<String, List<Map<String, List<String>>>>> statelist, String country, String state,
			String district, String pincode) throws Exception {

		for (Map<String, List<Map<String, List<String>>>> stateList : statelist) {
			Set<String> s = stateList.keySet();
			if (s.contains(state)) {
				stateCheck = true;
				System.out.println(state);

				List<Map<String, List<String>>> districts = stateList.get(state);
				// System.out.println(districts);
				validDistrict(districts, country, state, district, pincode);
			} else {
				stateCheck = false;
			}

		}
		if (!stateCheck) {
			throw new Exception(country + " Invalid " + state);
		}
	}

	public void logic(String country, String state, String district, String pincode) throws Exception {
		// System.out.println(s.getIndianPincodeData());
		Map<String, List<Map<String, List<Map<String, List<String>>>>>> data = s.getIndianPincodeData();

		List<Map<String, List<Map<String, List<String>>>>> statelist = data.get(country);

		if (statelist.isEmpty())
			throw new Exception("Invalid " + country);

		validState(statelist, country, state, district, pincode);
	}
}
