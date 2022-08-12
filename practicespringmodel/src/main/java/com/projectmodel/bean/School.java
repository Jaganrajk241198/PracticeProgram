package com.projectmodel.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class School {

	@Id
	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public School() {
		super();
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + "]";
	}

}
