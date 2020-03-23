package uvsq21807940;

public class vendeur  extends Employer{
	
	private double commission;
	
public vendeur(String coordonnes, int nombreAnnees) {
		super(coordonnes, nombreAnnees);
		this.commission=0;

	}


	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
	
	public void setCommission(double commission) {
		this.commission=commission;
	}

}
