package ma.ensa.entities;

public class TransactionContenu {
	private int idTransaction;
	private int idCompte;
	private double montant;
	private String dateTransaction;

	public TransactionContenu() {
		super();
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public TransactionContenu(int idTransaction, int idCompte, double montant, String dateTransaction) {
		this.idCompte = idCompte;
		this.idTransaction = idTransaction;
		this.montant = montant;
		this.dateTransaction = dateTransaction;
	}

	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

}
