package com.lordofthejars.hibernate.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
public class Starship {

	
	
	private Long id;
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE) public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	private Date launched;
	@Temporal(TemporalType.DATE)  public Date getLaunched() {return launched;}
	public void setLaunched(Date launched) {this.launched = launched;}

	private String registry;
	@Basic @NotNull  public String getRegistry() {return registry;}
	public void setRegistry(String registry) {this.registry = registry;}
	
	private StarshipClassEnum starshipClassEnum;
	@Enumerated public StarshipClassEnum getStarshipClassEnum() {return starshipClassEnum;}
	public void setStarshipClassEnum(StarshipClassEnum starshipClassEnum) {this.starshipClassEnum = starshipClassEnum;}
	
	
	private AffiliationEnum affiliationEnum;
	@Enumerated public AffiliationEnum getAffiliationEnum() {return affiliationEnum;}
	public void setAffiliationEnum(AffiliationEnum affiliationEnum) {this.affiliationEnum = affiliationEnum;}
	
	
	private Physics physics;
	@Embedded public Physics getPhysics() {return physics;}
	public void setPhysics(Physics physics) {this.physics = physics;}
	
	private List<Officer> officers = new ArrayList<Officer>();
	@OneToMany(cascade={CascadeType.ALL}) public List<Officer> getOfficers() {return Collections.unmodifiableList(officers);}
	protected void setOfficers(List<Officer> officers) {this.officers = officers;}
	public void addOfficer(Officer officer) {this.officers.add(officer);}
	
	public Starship() {
		super();
	}
	
	public Starship(String registry) {
		this.registry = registry;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((registry == null) ? 0 : registry.hashCode());
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
		Starship other = (Starship) obj;
		if (registry == null) {
			if (other.registry != null)
				return false;
		} else if (!registry.equals(other.registry))
			return false;
		return true;
	}
	
	
	
}
