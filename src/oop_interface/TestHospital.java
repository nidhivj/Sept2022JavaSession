package oop_interface;

public class TestHospital {

	public static void main(String[] args) {
		
		//create object of fortis hospital
		FortisHospital fh = new FortisHospital();
		fh.cardioservices();
		fh.neuroservices();
		fh.physioservices();
		fh.PediaServices();
		fh.ENTSerivces();
		fh.dentalSerivces();
		fh.orthoServices();
		fh.medicalTraining();
		fh.emargencySerivices();
		fh.medicalNews();
		fh.covidVaccicnation();
		fh.releaseFunds();
		
		
		System.out.println(USMedical.bill_amount); //static call by class or interface name
		USMedical.USMedicalHistory();
		//System.out.println(FortisHospital.bill_amount);
		System.out.println(fh.bill_amount);
		FortisHospital.USMedicalHistory();
		
		//FortisHospital.bill_amount = 100;  bcz of final we cann't change 
		
		//and we cann't create object of interface bcz that doesn't have any method body ex: 
		//USMedical usm = new USMedical();
		
		//top casting:
		//chlid class object can be referred by parent interface ref. vareiables:
		
		USMedical us = new FortisHospital();
		us.cardioservices();
		us.neuroservices();
		us.physioservices();
		us.emargencySerivices();
		
	     
		UKMedical uk = new FortisHospital();
		uk.PediaServices();
		
		IndianMedical ind = new FortisHospital();
	    ind.orthoServices();
		
	    //child class object can be referred by grand parent interface ref variable:
		WHO wh = new FortisHospital();
		wh.covidVaccicnation();
	   
		
		
		
		
		

	}

}
