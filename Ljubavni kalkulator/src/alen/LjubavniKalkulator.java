package alen;

public class LjubavniKalkulator {
	


	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String ime1="Marta";
		String ime2="Manuel";
		
		
		String zbrojImena= ime1.trim().toLowerCase() + ime2.trim().toLowerCase();
		
		
		System.out.println(ime1 + "    " + ime2);
		int brojac = 0;
		
		for(int i=0;i<zbrojImena.length();i++) {
			brojac=0;
			for(int j=0;j<zbrojImena.length();j++) {
				if(zbrojImena.charAt(i)==zbrojImena.charAt(j)) {
					brojac++;
				}
			}
			
			
			System.out.print(brojac);
		}
		
		
		

		
		
		
		
	}

}
