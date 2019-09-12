package datasmap.models;

import java.time.LocalDate;

public class Event {
	String name;
	String description;
	LocalDate date;
	String groupe;
	
	//GETTERS AND SETTERS
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
	public String getGroupe() {
		return groupe;
	}
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
