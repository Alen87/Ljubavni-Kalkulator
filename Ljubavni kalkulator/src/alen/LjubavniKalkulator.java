package alen;

import java.util.Arrays;

public class LjubavniKalkulator {

	public LjubavniKalkulator() {
		
		String ime1=" Marta",ime2="Manuel";
		
	    String zbroj=ime1.toLowerCase().trim() + ime2.toLowerCase().trim();
	    
	   int[]niz=new int[zbroj.length()]; 
		
		char count;
		
		for(int i=0;i < zbroj.length();i++) {
			count=0;
			for(int j=0;j<zbroj.length();j++) {
				if(zbroj.charAt(i)== zbroj.charAt(j)) {
					count++;
				}
			}
			niz[i]=count;
		}
		
		System.out.println(Arrays.toString(niz));
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new LjubavniKalkulator();
		
		
	}
	
	
	
	
}
