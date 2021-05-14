package hafta4odev3;

public class CampaignManager implements CampaignServices {

	@Override
	public void add(Campaign campaign) {
	System.out.println("Kampanya eklendi" +campaign.getCampaigName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi"+campaign.getCampaigName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi"+campaign.getCampaigName());
		
	}
	
	
		
	

}
