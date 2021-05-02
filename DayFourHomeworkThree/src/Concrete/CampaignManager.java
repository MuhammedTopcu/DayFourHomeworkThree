package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adlý kampanya eklendi.");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adlý kampanya silindi.");
	}
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adlý kampanya güncellendi.");
	}
}
