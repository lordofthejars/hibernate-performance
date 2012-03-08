package com.lordofthejars.hibernate.model;

import java.util.Date;

public class StarshipBuilder {
	
	private Starship starship;
	
	public static StarshipBuilder starship() {
		return new StarshipBuilder();
	}
	
	private StarshipBuilder() {
		super();
		this.starship = new Starship();
	}
	
	public StarshipBuilder affiliation(AffiliationEnum affiliationEnum) {
		this.starship.setAffiliationEnum(affiliationEnum);
		return this;
		
	}
	
	public StarshipBuilder launched(Date launched) {
		this.starship.setLaunched(launched);
		return this;
	}
	
	public StarshipBuilder physics(Physics physics) {
		this.starship.setPhysics(physics);
		return this;
	}
	
	public StarshipBuilder registry(String registry) {
		this.starship.setRegistry(registry);
		return this;
	}
	
	public StarshipBuilder starshipClass(StarshipClassEnum starshipClassEnum) {
		this.starship.setStarshipClassEnum(starshipClassEnum);
		return this;
	}
	
	public Starship build() {
		return this.starship;
	}
	
}
