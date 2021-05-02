package Abstract;

import Entities.Campaign;
import Entities.GameSale;
import Entities.GamerCustomer;

public interface GameSaleService {
	void sell(GamerCustomer gamer, GameSale gameSale);
	void sellWithDiscount(GamerCustomer gamer, GameSale gameSale, Campaign campaign);
}
