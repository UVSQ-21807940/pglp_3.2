package uvsq21807940;

public class Employer {
	
	private String coordonnees;
	private int nombreAnnees;

	public Employer(Object coordonnees, int nombreAnnees){
        this.coordonnees = (String) coordonnees;
       
        this.nombreAnnees = nombreAnnees;
    }

	public String getCoordonnees() {
		return coordonnees.toString();
	}
	
	public double calculSalaire() {
		return 1500 + nombreAnnees * 20;
	}
	

}
