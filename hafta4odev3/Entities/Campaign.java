package hafta4odev3;

public class Campaign implements Entity 
{

   private int id;
   private String campaigName;
   
   
   public Campaign(int id, String campaigName) {

	this.id = id;
	this.campaigName = campaigName;

}
  
   
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getCampaigName() {
	return campaigName;
}


public void setCampaigName(String campaigName) {
	this.campaigName = campaigName;
}


}