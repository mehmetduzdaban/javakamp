package business.abstracts;

public interface EmailService {
	public String SendMail(String email);

	public boolean Verify(String email, String confirmCode);
}
