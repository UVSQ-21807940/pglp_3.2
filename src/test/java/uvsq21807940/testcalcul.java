package uvsq21807940;

import static org.junit.Assert.*;

import org.junit.Test;


public class testcalcul {

	 @Test
	    public void creerEmploye(){
	        Employer e = new Employer("bob berlin", 2);
	        assertTrue(e != null);
	    }

	 
	 @Test
	    public void salaireEmploye(){
	        Employer e = new Employer("Bob  berlin", 2);
	        assertTrue(e.calculSalaire() == 1540);
	    }
	 
	 @Test
	    public void createVendeur(){
	        vendeur v = new vendeur("shan pekin", 200);
	        assertTrue(v != null);
	    }
	 
	 @Test
	 public void SalaireVendeur() {
			vendeur V= new vendeur("John SMITH",0);
			V.setCommission(100);
			double expected=1600;
			assertTrue(expected==V.calculSalaire());
		}
    }
