package com.supportwork;

public class Logic {
	public void check(Model m) throws Exception {
		String xCol = m.getxCol();
		String yCol = m.getyCol();
		String zCol = m.getzCol();
		String pCol = m.getpCol();
		if (xCol.equals("A")) {
			if (yCol.equals("A1")) {
				if (zCol.equals("A2")) {
					if (pCol.equals("A3"))
						System.out.println("A->A1->A2->A3");

					throw new Exception("Invalid A->A1->A2->" + pCol);

				} else if (zCol.equals("B2")) {
					if (pCol.equals("B3"))
						System.out.println("A->A1->B2->B3");
					else if (pCol.equals("C3"))
						System.out.println("A->A1->B2->C3");

					throw new Exception("Invalid A->A1->B2->" + pCol);
				}
				throw new Exception("A->A1->" + zCol);

			} else if (yCol.equals("B1")) {
				if (zCol.equals("B2")) {
					if (pCol.equals("C3"))
						System.out.println("A->B1->B2->C3");

					throw new Exception("Invalid A->B1->B2->" + pCol);

				} else if (zCol.equals("C2")) {
					if (pCol.equals("D3"))
						System.out.println("A->B1->C2->D3");

					throw new Exception("Invalid A->B1->C2->" + pCol);

				}
				throw new Exception("Invalid A->B1->" + zCol);

			}
			throw new Exception("Invalid A -> " + yCol);

		} else if (xCol.equals("B")) {
			if (yCol.equals("B1")) {
				if (zCol.equals("B2")) {
					if (pCol.equals("E3"))
						System.out.println("B->B1->B2->E3");

					throw new Exception("Invalid B->B1->B2->" + pCol);

				}
				throw new Exception("Invalid B->B1->" + zCol);

			} else if (yCol.equals("C1")) {
				if (zCol.equals("B2")) {
					if (pCol.equals("F3"))
						System.out.println("B->C1->B2->F3");

					throw new Exception("Invalid B->C1->B2->" + pCol);

				}
				throw new Exception("Invalid B->C1->" + zCol);

			}
			throw new Exception("Invalid B->" + yCol);

		} else if (xCol.equals("C")) {
			if (yCol.equals("A1")) {
				if (zCol.equals("A2")) {
					if (pCol.equals("G3"))
						System.out.println("C->A1->A2->G3");

					throw new Exception("Invalid C->A1->A2->" + pCol);

				} else if (zCol.equals("B2")) {
					if (pCol.equals("H3"))
						System.out.println("C->A1->B2->H3");

					throw new Exception("Invalid C->A1->B2->" + pCol);

				}
				throw new Exception("Invalid C->A1->" + zCol);

			} else if (yCol.equals("B1")) {
				if (zCol.equals("B2")) {
					if (pCol.equals("I3"))
						System.out.println("C->B1->B2->I3");

					throw new Exception("Invalid C->B1->B2" + pCol);

				}
				throw new Exception("Invalid C->B1->" + zCol);

			} else if (yCol.equals("C1")) {
				if (zCol.equals("C2")) {
					if (pCol.equals("A3"))
						System.out.println("C->C1->C2->A3");

					throw new Exception("Invalid C->C1->C2->" + pCol);

				}
				throw new Exception("Invalid C->C1->" + zCol);

			}
			throw new Exception("Invalid C->" + yCol);

		}
		throw new Exception("Invalid " + xCol);

	}
}
