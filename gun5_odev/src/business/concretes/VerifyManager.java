package business.concretes;

import business.abstracts.VerifyService;
import dataAccess.abstracts.VerifyDao;
import entities.concretes.Verify;

public class VerifyManager implements VerifyService {

	private VerifyDao verifyDao;

	public VerifyManager(VerifyDao verifyDao) {
		this.verifyDao = verifyDao;
	}

	@Override
	public void add(Verify verify) {
		this.verifyDao.add(verify);
	}

	@Override
	public void delete(Verify verify) {
		this.verifyDao.delete(verify);
	}

	@Override
	public boolean verification(String email, String confirmCode) {
		return this.verifyDao.verification(email, confirmCode);
	}

}
