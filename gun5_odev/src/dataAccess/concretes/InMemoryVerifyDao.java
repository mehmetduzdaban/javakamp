package dataAccess.concretes;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.VerifyDao;
import entities.concretes.Verify;

public class InMemoryVerifyDao implements VerifyDao {

	private List<Verify> verifies;

	public InMemoryVerifyDao() {
		this.verifies = new ArrayList<Verify>();
	}

	@Override
	public void add(Verify verify) {
		this.verifies.add(verify);
	}

	@Override
	public void delete(Verify verify) {
		int result = this.verifies.indexOf(verify);
		this.verifies.remove(result);
	}

	@Override
	public boolean verification(String email, String confirmCode) {
		Verify result = this.verifies.stream().filter((v) -> v.getEmail() == email && v.getConfirmCode() == confirmCode)
				.findFirst().orElse(null);
		if (result != null) {

			Instant start = result.getExpiration().toInstant();
			Instant end = Instant.now();
			long diff = Duration.between(end, start).toMinutes();

			if (diff > 0) {
				return true;
			}
		}
		return false;
	}

}
