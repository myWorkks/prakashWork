package com.supportwork;

public class Tester {
	public static void main(String[] args) {
		LogicService s = new LogicService();
		try {
			s.logic("India", "Andhra Pradesh", "Chittor", "111111");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
//		Logic l = new Logic();
//		Model m = new Model();
//		m.setxCol("B");
//		m.setyCol("B1");
//		m.setzCol("B2");
//		m.setpCol("B3");
//		try {
//			l.check(m);
//		} catch (Exception e) {
//
//			System.out.println(e.getMessage());
//		}
	}
}
