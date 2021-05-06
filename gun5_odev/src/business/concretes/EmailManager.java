package business.concretes;

import java.util.Random;

import business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public String SendMail(String email) {
		Random rnd = new Random();
		int confirmCode = rnd.nextInt(999999);
		System.out.println("Kayýt onay kodu : " + confirmCode);
		return String.valueOf(confirmCode);
	}

	@Override
	public boolean Verify(String email, String confirmCode) {
		return false;
	}

}
