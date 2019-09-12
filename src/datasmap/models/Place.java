package datasmap.models;

public class Place {
	String address;
	double latitude;
	double longitude;
	
	public String getAddress() {
		//retourner l'adresse complète du lieu
		return address;
	}
	public String getAddress(String niveau) {
		//retourner l'adresse complète du lieu
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
}
