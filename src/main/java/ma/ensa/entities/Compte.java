package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compte {

	@Id
	private int idcompte;
	private double solde;

	public Compte() {
		super();
	}

	public Compte(int idcompte, double solde) {
		super();
		this.idcompte = idcompte;
		this.solde = solde;
	}

	public int getIdcompte() {
		return idcompte;
	}

	public void setIdcompte(int idcompte) {
		this.idcompte = idcompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
