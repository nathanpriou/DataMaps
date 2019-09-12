package datasmap.models;

public class Site extends Place{
	String name;
	String description;
	
	//1
	public Site(String name, String description, String address) {
		this.name = name;
		this.description = description;		
		this.address = address;
	}
	
	//2
	public Site(String name, String description, double latitude, double longitude) {
		this.name = name;
		this.description = description;	
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	//3
	public Site(String name, String description, Place place) {
		this.name = name;
		this.description = description;	
	}
	
	
	//Getter et setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	
}
