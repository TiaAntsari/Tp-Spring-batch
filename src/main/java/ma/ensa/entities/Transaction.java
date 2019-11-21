package ma.ensa.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	private int idTransaction;
	@ManyToOne
	@JoinColumn(name = "idCompte")
	private Compte compte;
	private double montant;
	private Date dateTransaction;
	private String dateDebit;

	public Transaction() {
		super();
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Transaction(int idTransaction, double montant, Date dateTransaction, String dateDebit) {
		super();
		this.idTransaction = idTransaction;
		this.montant = montant;
		this.dateTransaction = dateTransaction;
		this.dateDebit = dateDebit;
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

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public String getDateDebit() {
		return dateDebit;
	}

	public void setDateDebit(String dateDebit) {
		this.dateDebit = dateDebit;
	}

}
