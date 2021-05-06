package concretes;

import abstracts.SalesService;
import entities.Game;
import entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void buyGame(Gamer gamer, Game game) {
		System.out.println("Oyuncu : " + gamer.getName() + " " + game.getGameName() + " oyununu satın aldı : "
				+ game.getGamePrice());
	}

	@Override
	public void giveBack(Gamer gamer, Game game) {
		System.out.println("Oyuncu : " + gamer.getName() + " " + game.getGameName() + " oyununu iade etti.");
	}
}
