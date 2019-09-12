package datasmap.models;

import java.util.List;

public class Place {
	protected String address;
	protected double latitude;
	protected double longitude;
	private Place parent;
	private List<Site> sites;
	
	public Place(String address, double latitude, double longitude) {
		this(address,latitude,longitude,null); //repere via nom methode + types de parametres + null en ref au parent 
	}

	public Place(String address, double latitude, double longitude, Place parent) {
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;yeah
		this.parent = parent;
	}

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
