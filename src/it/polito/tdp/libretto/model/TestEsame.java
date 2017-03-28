package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		
		Esame tdp=new Esame("03FYZ", "Tecniche di Programmazione", "Fulvio Corno");
		System.out.println(tdp);
		
		Esame pwr=new Esame("04CIC", "Progettazione web", "Antonio Lioy");
		System.out.println(pwr);
		
		System.out.println(pwr.equals(tdp));
		
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
		tdp.supera(18, LocalDate.now());
		System.out.println(tdp);
		
	}

}
