package concretes;

import abstracts.CampaignService;
import entities.Campaign;
import entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampaignName() + " %" + campaign.getDiscount());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getCampaignName() + " %" + campaign.getDiscount());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName() + " %" + campaign.getDiscount());

	}

	@Override
	public void CampaignSale(Campaign campaign, Game game) {
		double newPrice = game.getGamePrice() - ((game.getGamePrice() * campaign.getDiscount() / 100));
		System.out.println(game.getGameName() + " satıldı, " + campaign.getCampaignName() + " %"
				+ campaign.getDiscount() + " indirimli fiyat : " + newPrice);
	}
}
