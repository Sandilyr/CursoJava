package com.softtek.java.academy.jdbc.entity;

public class City {
	
	private int city_id;
	private String description;
	private int state_id;
	
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + city_id;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + state_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (city_id != other.city_id)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (state_id != other.state_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", description=" + description
				+ ", state_id=" + state_id + "]";
	}


}
