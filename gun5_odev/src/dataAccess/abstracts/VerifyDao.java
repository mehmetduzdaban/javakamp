package dataAccess.abstracts;

import entities.concretes.Verify;

public interface VerifyDao {
	void add(Verify verify);

	void delete(Verify verify);

	boolean verification(String email, String confirmCode);
}
