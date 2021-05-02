package Concrete;

import Abstract.GamerCustomerService;
import Entities.GamerCustomer;

public class GamerCustomerManager implements GamerCustomerService {

	@Override
	public void add(GamerCustomer gamerCustomer) {
		System.out.println(gamerCustomer.getFirsName() + " Adl� oyuncu eklendi.");
		
	}

	@Override
	public void delete(GamerCustomer gamerCustomer) {
		System.out.println(gamerCustomer.getFirsName() + " Adl� oyuncu silindi.");
		
	}

	@Override
	public void update(GamerCustomer gamerCustomer) {
		System.out.println(gamerCustomer.getFirsName() + " Adl� oyuncu g�ncellendi.");
		
	}
	 
	 
}
