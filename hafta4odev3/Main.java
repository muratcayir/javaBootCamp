package hafta4odev3;
import  Abstract.Gamer;

public class Main {

	public static void main(String[] args) {
	
	Gamer gamer=new Gamer();
		gamer.setBirthYear(1996);
		gamer.setFirstName("MURAT");
		gamer.setId(1);
		gamer.setIdentityNumber(23232323);
		gamer.setLastName("ÇAYIR");
		
	GamerManager gamerManager = new GamerManager(new UserValidationManager());
	   gamerManager.add(gamer);
		
		
		
		
		
	}

}
