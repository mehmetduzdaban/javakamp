package business.abstracts;

import entities.concretes.User;

public interface AuthService {

	boolean signIn(User user);

	boolean signInByGoogle(User user);

	boolean signUp(User user);

	boolean signOut(User user);

	boolean isValidEmailAddress(String email);

	boolean mailConfirmation(String email, String confirmCode);

}
