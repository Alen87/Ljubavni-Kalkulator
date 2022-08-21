package alen;

import javax.swing.JOptionPane;

public class LjubavniKalkulatorFor {
	public static int izracunaj(String niz) {

		if (niz.length() <= 2) {
			return Integer.parseInt(niz);
		}

		StringBuilder noviNiz = new StringBuilder();
		String[] nizVrijednosti = niz.split("");
		for (int i = 0, j = niz.length() - 1; i <= j; i++, j--) {
			if (i == j) {
				noviNiz.append(nizVrijednosti[i]);
				break;
			}
			noviNiz.append(Integer.parseInt(nizVrijednosti[i]) + Integer.parseInt(nizVrijednosti[j]));

		}

		System.out.println(noviNiz);
		return izracunaj(noviNiz.toString());

	}

	public static void main(String[] args) {
		String ime1;
		String ime2;

		try {
			ime1 = JOptionPane.showInputDialog("Unesi  prvo ime");
			ime2 = JOptionPane.showInputDialog("Unesi  drugo ime");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Obvezan  unos");
			return;
		}

		String zbrojImena = ime1.trim().toLowerCase() + ime2.trim().toLowerCase();
		StringBuilder zbroj = new StringBuilder();

		System.out.printf("%s %8s%n", ime1, ime2);

		int brojac;

		for (int i = 0; i < zbrojImena.length(); i++) {
			brojac = 0;
			for (int j = 0; j < zbrojImena.length(); j++) {
				if (zbrojImena.charAt(i) == zbrojImena.charAt(j)) {
					brojac++;
				}
			}
			zbroj.append(brojac);
		}

		System.out.println(zbroj);
		izracunaj(zbroj.toString());

	}

}
