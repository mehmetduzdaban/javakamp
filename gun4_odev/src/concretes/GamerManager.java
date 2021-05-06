package concretes;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckCheckService;

	public GamerManager(GamerCheckService gamerCheckCheckService) {
		this.gamerCheckCheckService = gamerCheckCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		boolean result = gamerCheckCheckService.CheckIfRealPerson(gamer);
		if (!result) {
			System.out.println("Mernis doğrulama başarısız!");
			return;
		}
		System.out.println("Oyuncu eklendi : " + gamer.getName() + " " + gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getName() + " " + gamer.getLastName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getName() + " " + gamer.getLastName());
	}
}