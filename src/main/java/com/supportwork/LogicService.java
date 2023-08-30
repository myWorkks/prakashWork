package com.supportwork;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class LogicService {
	private Service s = new Service();

	private boolean stateCheck = true;
	String stateKey = "";

	public void validState(List<Map<String, List<Map<String, List<String>>>>> statelist, String state, String district,
			String pincode) {
		for (Map<String, List<Map<String, List<String>>>> stateList : statelist) {
			Set<String> s = stateList.keySet();
			for (String stateChe : s) {
				System.out.println(stateChe);
				if (!stateChe.equalsIgnoreCase(state)) {
					stateCheck = false;
				} else
					stateCheck = true;
				break;
			}
		}
	}

	public void logic(String country, String state, String district, String pincode) throws Exception {
		// System.out.println(s.getIndianPincodeData());
		Map<String, List<Map<String, List<Map<String, List<String>>>>>> data = s.getIndianPincodeData();

		List<Map<String, List<Map<String, List<String>>>>> statelist = data.get(country);

		if (statelist == null)
			throw new Exception("Invalid " + country);

		validState(statelist, state, district, pincode);
	}
}
