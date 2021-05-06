package entities.concretes;

import java.util.Calendar;
import java.util.Date;

import entities.abstracts.Entity;

public class Verify implements Entity {
	private String Email;
	private String ConfirmCode;
	private Date Expiration;

	public Verify(String email, String confirmCode) {
		super();
		Email = email;
		ConfirmCode = confirmCode;

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, 30);

		Expiration = calendar.getTime();
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getConfirmCode() {
		return ConfirmCode;
	}

	public void setConfirmCode(String confirmCode) {
		ConfirmCode = confirmCode;
	}

	public Date getExpiration() {
		return Expiration;
	}

	public void setExpiration(Date expiration) {
		Expiration = expiration;
	}
}
