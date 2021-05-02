package Concrete;

import Abstract.GamerCheckService;
import Entities.GamerCustomer;

public class GamerCheckManager implements GamerCheckService {
	

	@Override
	public boolean checkIfRealPerson(GamerCustomer gamerCustomer) {
		
		return true;
	}
}
