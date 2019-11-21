package ma.ensa;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CompteTransactionBatchApplication {

	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {

		// SpringApplication.run(CompteTransactionBatchApplication.class, args);

		ApplicationContext ctx = new ClassPathXmlApplicationContext("ma/ensa/config/SpringConf.xml");

		Job job = (Job) ctx.getBean("importTransactions");
		JobParametersBuilder jobBuilder = new JobParametersBuilder();
		jobBuilder.addString("AddTransaction", "Transaction ajouté");
		jobBuilder.addLong("Current Time", System.currentTimeMillis());
		JobParameters jobParameters = jobBuilder.toJobParameters();
		JobLauncher jobLauncher = (JobLauncher) ctx.getBean("jobLauncher");
		JobExecution execution = jobLauncher.run(job, jobParameters);
		System.out.println("Completion Status : " + execution.getStatus());

	}

}
