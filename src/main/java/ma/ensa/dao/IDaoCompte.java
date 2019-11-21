package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Compte;

public interface IDaoCompte extends JpaRepository<Compte, Integer> {
	public Compte findByIdcompte(int idCompte);
}
