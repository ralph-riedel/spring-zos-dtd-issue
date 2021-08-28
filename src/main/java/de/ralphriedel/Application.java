package de.ralphriedel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.support.SQLErrorCodes;
import org.springframework.jdbc.support.SQLErrorCodesFactory;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... args) throws Exception {
		final SQLErrorCodes errorCodes = SQLErrorCodesFactory.getInstance().getErrorCodes("DB2");
	}
}
