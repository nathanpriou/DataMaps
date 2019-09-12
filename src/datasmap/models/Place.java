package datasmap.models;

import java.util.ArrayList;
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
		this.longitude = longitude;
		this.parent = parent;
		sites = new ArrayList<Site>();
	}

	public String getAddress() {
		String result = address;
		if(parent!=null) {
			result+=", "+parent.getAddress();
		}
		return result;
	}
	public Place getParent() {
		return parent;
	}

	public void setParent(Place parent) {
		this.parent = parent;
	}

	public List<Site> getSites() {
		return sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}

	public String getAddress(int niveau) {
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
