package hafta4odev3;
import Abstract.Entity;

public class Gamer {
	
	private int Id ;
	private String FirstName;
	private String LastName;
	private int BirthYear;
	private Long IdentityNumber;
	
	public Gamer()
	{
		
	}
	public Gamer(int id, String FirstName, String LastName, int BirthYear, Long IdentityNumber) {
		super();
		this.Id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.BirthYear = BirthYear;
		this.IdentityNumber = IdentityNumber;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public int getBirthYear() {
		return BirthYear;
	}
	public void setBirthYear(int birthYear) {
		this.BirthYear = birthYear;
	}
	public Long getIdentityNumber() {
		return IdentityNumber;
	}
	public void setIdentityNumber(long IdentityNumber) {
		this.IdentityNumber = IdentityNumber;
	} 
	
	

}
