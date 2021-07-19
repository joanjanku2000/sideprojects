package dto;

public class BillionareCreateDto {
	private String name;
	private String lastName;
	private String career;
	public String getName() {
		return name;
	}
	public BillionareCreateDto() {
		super();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public BillionareCreateDto(String name, String lastName, String career) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.career = career;
	}
	
}
