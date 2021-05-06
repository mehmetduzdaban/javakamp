package business.abstracts;

import entities.concretes.Verify;

public interface VerifyService {
	void add(Verify verify);

	void delete(Verify verify);

	boolean verification(String email, String confirmCode);
}
