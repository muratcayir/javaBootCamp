package hafta4odev3;

public class GamerManager implements GamerService {
	
	UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
	
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(userValidationService.Validate(gamer))
			System.out.print("Kay�t Eklendi");
		
		else
			System.out.print("Kay�t Eklenemedi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.print("Kay�t g�ncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.print("Kay�t silindi");
		
	}

}
