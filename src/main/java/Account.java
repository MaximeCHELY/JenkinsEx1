
public class Account {
	private int id;
	private double solde;
	private double taux;
	
	public Account() {
		this.id = 0;
		this.solde = 0;
		this.taux = 0;
	}
	
	public Account(int id, double solde, double taux) {
		this.id = id;
		this.solde = solde;
		this.taux = taux;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	public void depot(double somme) {
		this.solde = this.solde + somme;
	}
	
	public void retrait(double somme) {
		this.solde = this.solde - somme;
	}
}
