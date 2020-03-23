package uvsq21807940;


import java.util.ArrayList;
import java.util.List;

public class Entreprise {

	private List<salaire> salaireList;
	
	public Entreprise() {
		salaireList = new ArrayList<salaire>();
	}
	
	public double getSommeTotaleDesSalaires() {
		double sum = 0;
		for (salaire s : salaireList) {
			sum += s.calculSalaire();
		}
		return sum;
	}
}
	