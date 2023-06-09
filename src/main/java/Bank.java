import java.util.ArrayList;

public class Bank {
	
	private int id;
	private ArrayList<Account> comptes = new ArrayList<Account>();
	
	public Bank() {
		this.id = 0;
	}
	
	public Bank(int id, ArrayList<Account> comptes) {
		this.id = id;
	}
	
	public void addAccount(Account compte) {
		this.comptes.add(compte);
	}
	
	public void deleteAccount(Account compte) {
		this.comptes.remove(compte);
	}
	
	public void afficherLesSoldes() {
		for(int i=0; i < this.comptes.size(); i++) {
			System.out.println("Solde du compte" + this.comptes.get(i).getId() + " : " + this.comptes.get(i).getSolde() + "/n");
		}
	}
	
	public void calculerInteret(Account account, int duree) {
		double interet = 0;
		double solde = account.getSolde();
		for (int i = 0; i < duree; i++) {
			interet = solde * account.getTaux();
			solde = solde + interet;
		}
		System.out.println("Intêret après " + duree + " année(s) : " + interet);
	}
	
	public void transfert(Account account1, Account account2, double somme) {
		account1.retrait(somme);
		account2.depot(somme);
	}
}
