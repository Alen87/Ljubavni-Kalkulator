package alen;

import javax.swing.JOptionPane;

public class LjubavniKalkulatorWhile {
	public static int izracunaj(String niz) {
		if (niz.length() <= 2) {
			return Integer.parseInt(niz);
		}

		StringBuilder noviNiz = new StringBuilder();
		String[] nizVrijednosti = niz.split("");

		int i = 0;
		int j = niz.length() - 1;

		while (i <= j) {
			if (i == j) {
				noviNiz.append(nizVrijednosti[i]);
				break;
			}

			noviNiz.append(Integer.parseInt(nizVrijednosti[i]) + Integer.parseInt(nizVrijednosti[j]));
			i++;
			j--;

		}
		System.out.println(noviNiz);
		return izracunaj(noviNiz.toString());
	}

	public static String ucitajString(String poruka) {
		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;
			}
			return s;
		}
	}

	public LjubavniKalkulatorWhile() {

		String ime1 = ucitajString("Unesi prvo ime;");
		String ime2 = ucitajString("Unesi drugo ime:");

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

	public static void main(String[] args) {
		new LjubavniKalkulatorWhile();

	}

}
