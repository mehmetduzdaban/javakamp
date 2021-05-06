package entities;

import java.time.LocalDate;

import abstracts.Entity;

public class Gamer implements Entity {
	private int gamerId;
	private String name;
	private String lastName;
	private LocalDate dateOfBirth;
	private String NationalityId;

	public Gamer() {
	}

	public Gamer(int gamerId, String name, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.gamerId = gamerId;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getName() {
		return name;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
}