package abstracts;

import entities.Game;
import entities.Gamer;

public interface SalesService {
	void buyGame(Gamer gamer, Game game);

	void giveBack(Gamer gamer, Game game);
}