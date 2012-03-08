package com.lordofthejars.hibernate.model;

public class OfficerBuilder {

	private Officer officer;
	
	public static OfficerBuilder officer() {
		return new OfficerBuilder();
	}
	
	private OfficerBuilder() {
		super();
		this.officer = new Officer();
	}
	
	public OfficerBuilder affiliation(AffiliationEnum affiliationEnum) {
		this.officer.setAffiliationEnum(affiliationEnum);
		return this;
	}
	
	public OfficerBuilder homePlanet(PlanetEnum planetEnum) {
		this.officer.setHomePlanet(planetEnum);
		return this;
	}
	
	public OfficerBuilder name(String name) {
		this.officer.setName(name);
		return this;
	}
	
	public OfficerBuilder rank(RankEnum rankEnum) {
		this.officer.setRank(rankEnum);
		return this;
	}

	public OfficerBuilder speciment(SpeciesEnum speciesEnum) {
		this.officer.setSpeciesEnum(speciesEnum);
		return this;
	}
	
	public OfficerBuilder serves(Starship starship) {
		this.officer.setStarship(starship);
		return this;
	}
	
	public Officer build() {
		return this.officer;
	}
	
}
