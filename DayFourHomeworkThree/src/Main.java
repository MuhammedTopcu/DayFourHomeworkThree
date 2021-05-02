import Concrete.CampaignManager;
import Concrete.GameSaleManager;
import Concrete.GamerCustomerManager;
import Entities.Campaign;
import Entities.GameSale;
import Entities.GamerCustomer;

public class Main {

	public static void main(String[] args) {
		
		GamerCustomer gamerCustomer = new GamerCustomer();
		gamerCustomer.setId(1);
		gamerCustomer.setNationalityId("12345678910");
		gamerCustomer.setFirsName("Muhammed");
		gamerCustomer.setLastName("TOPCU");
		gamerCustomer.setBirthDay("19-12-1996");
		
		GamerCustomerManager gamerCustomerManager = new GamerCustomerManager();
		gamerCustomerManager.add(gamerCustomer);
		gamerCustomerManager.delete(gamerCustomer);
		gamerCustomerManager.update(gamerCustomer);
		
		GameSale gameSale = new GameSale();
		gameSale.setGameId(1);
		gameSale.setGameName("Oyun 1");
		gameSale.setPrice(500);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("kampanya 1 ");
		campaign.setCampaignDiscountRate("10");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sell(gamerCustomer, gameSale);
		gameSaleManager.sellWithDiscount(gamerCustomer, gameSale, campaign);

	}

}
