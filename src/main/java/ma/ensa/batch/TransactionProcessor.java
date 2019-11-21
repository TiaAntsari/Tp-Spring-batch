package ma.ensa.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import ma.ensa.dao.IDaoCompte;
import ma.ensa.entities.Transaction;
import ma.ensa.entities.TransactionContenu;

@Service("transactionProcessor")
public class TransactionProcessor implements ItemProcessor<TransactionContenu, Transaction> {

	// @Autowired
	IDaoCompte daoCompte;

	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	private Date dateNow = new Date();

	@Override
	public Transaction process(TransactionContenu transactionContenu) throws Exception {

		Transaction transaction = new Transaction();

		transaction.setIdTransaction(transactionContenu.getIdTransaction());

		if (daoCompte.findByIdcompte(transactionContenu.getIdCompte()) != null) {
			transaction.setCompte(daoCompte.findByIdcompte(transactionContenu.getIdCompte()));
		}

		transaction.setMontant(transactionContenu.getMontant());
		transaction.setDateTransaction(simpleDateFormat.parse(transactionContenu.getDateTransaction()));
		transaction.setDateDebit(simpleDateFormat.format(dateNow));

		return transaction;
	}

}
