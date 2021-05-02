package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adl� kampanya eklendi.");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adl� kampanya silindi.");
	}
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adl� kampanya g�ncellendi.");
	}
}
