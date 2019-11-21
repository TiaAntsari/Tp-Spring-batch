package ma.ensa.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.IDaoTransaction;
import ma.ensa.entities.Transaction;

@Service("transactionWriter")
public class TransactionWriter implements ItemWriter<Transaction> {

	@Autowired
	private IDaoTransaction daoTransaction;

	@Override
	public void write(List<? extends Transaction> transactions) throws Exception {
		for (Transaction transaction : transactions) {
			daoTransaction.addTransaction(transaction);
		}

	}

}
