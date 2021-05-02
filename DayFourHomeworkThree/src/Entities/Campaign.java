package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private String campaignDiscountRate;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, String campaignDiscountRate) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscountRate = campaignDiscountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDiscountRate() {
		return campaignDiscountRate;
	}

	public void setCampaignDiscountRate(String campaignDiscountRate) {
		this.campaignDiscountRate = campaignDiscountRate;
	}
}
