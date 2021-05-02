package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.GameSale;
import Entities.GamerCustomer;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sell(GamerCustomer gamer, GameSale gameSale) {
		System.out.println(gameSale.getGameName() + " " + gamer.getFirsName() + " Adl� oyuncuya sat�ld�." );
		
	}

	@Override
	public void sellWithDiscount(GamerCustomer gamer, GameSale gameSale, Campaign campaign) {
		System.out.println(campaign.getCampaignName() + gamer.getFirsName() + " Adl� oyuncuya sat�ld�.");
		
	}

}
