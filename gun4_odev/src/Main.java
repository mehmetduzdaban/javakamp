import java.time.LocalDate;

import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import concretes.SalesManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import services.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer(1, "Ahmet", "Erdoğan", LocalDate.of(2000, 1, 1), "00000000000");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);

		Game game1 = new Game(1, "Tetris", 60);
		Game game2 = new Game(2, "Mario", 70);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);

		Campaign campaign1 = new Campaign(1, "23 Nisan Kampanyası", 10);
		Campaign campaign2 = new Campaign(2, "Yılbaşı Kampanyası", 5);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign2);
		campaignManager.CampaignSale(campaign1, game1);

		SalesManager salesManager = new SalesManager();
		salesManager.buyGame(gamer, game2);
		salesManager.giveBack(gamer, game1);

	}

}
