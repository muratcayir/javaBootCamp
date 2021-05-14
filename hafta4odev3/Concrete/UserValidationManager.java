package hafta4odev3;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean Validate(Gamer gamer) {
	
		if(gamer.getBirthYear() == 1996 && gamer.getFirstName()== "MURAT" && gamer.getIdentityNumber()==23232323)
		{
			return true;
		}
		
		else
			return false;
		
	}

}
