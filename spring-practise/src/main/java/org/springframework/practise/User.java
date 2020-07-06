package org.springframework.practise;

import java.io.Serializable;

public class User implements Serializable {

	private String name;

	private String address;

	private int id;

	public User() {
	}

	public User(String name, String address, int id) {
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", id=" + id +
				'}';
	}
}
