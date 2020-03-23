package uvsq21807940;

public class Manager extends Employer {
	
	private int nb_ordre;


	public Manager(String coordonnes, int nombreAnnees) {
		super(coordonnes, nombreAnnees);
		nb_ordre=1;
	}
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + nb_ordre*100;
	}

	public void setNb_ordre(int n) {
		this.nb_ordre=n;
		
	}

}
