package com.lordofthejars.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Officer {

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE) private Long id;
	public Long getId() {return id;}
	protected void setId(Long id) {this.id = id;}


	@Column(unique=true, nullable=false) private String name;
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	
	@Enumerated private SpeciesEnum speciesEnum;
	public SpeciesEnum getSpeciesEnum() {return speciesEnum;}
	public void setSpeciesEnum(SpeciesEnum speciesEnum) {this.speciesEnum = speciesEnum;}


	@Enumerated private PlanetEnum homePlanet;
	public PlanetEnum getHomePlanet() {return homePlanet;}
	public void setHomePlanet(PlanetEnum homePlanet) {this.homePlanet = homePlanet;}


	@Enumerated private AffiliationEnum affiliationEnum;
	public AffiliationEnum getAffiliationEnum() {return affiliationEnum;}
	public void setAffiliationEnum(AffiliationEnum affiliationEnum) {this.affiliationEnum = affiliationEnum;}


	@Enumerated @NotNull private RankEnum rank;
	public RankEnum getRank() {return rank;}
	public void setRank(RankEnum rank) {this.rank = rank;}
	
	@ManyToOne private Starship starship;	
	public Starship getStarship() {return starship;}
	protected void setStarship(Starship starship) {this.starship = starship;}
	
	public Officer() {
		super();
	}
	
	public Officer(String name, RankEnum rank) {
		setName(name);
		setRank(rank);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Officer other = (Officer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Officer [name=").append(name).append(", rank=")
				.append(rank).append("]");
		return builder.toString();
	}
	
	
}
