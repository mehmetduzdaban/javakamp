package gun5_odev;

import business.abstracts.AuthService;
import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.abstracts.VerifyService;
import business.concretes.AuthManager;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import business.concretes.VerifyManager;
import dataAccess.concretes.InMemoryUserDao;
import dataAccess.concretes.InMemoryVerifyDao;
import entities.concretes.User;
import entities.concretes.Verify;

public class Main {

	public static void main(String[] args) {

		User user = new User(1, "Ahmet", "Erdoðan", "test@test.com", "123456", false);

		UserService userService = new UserManager(new InMemoryUserDao());

		EmailService emailService = new EmailManager();
		String confirmCode = emailService.SendMail(user.getEmail());

		Verify verify = new Verify(user.getEmail(), confirmCode);

		VerifyService verifyService = new VerifyManager(new InMemoryVerifyDao());
		verifyService.add(verify);

		AuthService authService = new AuthManager(userService, verifyService);
		authService.signUp(user);

		authService.mailConfirmation(user.getEmail(), confirmCode);

		authService.signOut(user);
		authService.signIn(user);

		User googleUser = new User(1, "test", "test", "deneme@gmail.com", "123456", false);

		authService.signInByGoogle(googleUser);

	}

}
