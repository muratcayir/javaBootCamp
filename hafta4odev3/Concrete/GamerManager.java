package hafta4odev3;

public class GamerManager implements GamerService {
	
	UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
	
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(userValidationService.Validate(gamer))
			System.out.print("Kayýt Eklendi");
		
		else
			System.out.print("Kayýt Eklenemedi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.print("Kayýt güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.print("Kayýt silindi");
		
	}

}
