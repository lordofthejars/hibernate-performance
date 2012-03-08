package com.lordofthejars.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;
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

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE) 
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	@Temporal(TemporalType.DATE) private Date launched;
	public Date getLaunched() {return launched;}
	public void setLaunched(Date launched) {this.launched = launched;}

	@Basic @NotNull private String registry;
	public String getRegistry() {return registry;}
	public void setRegistry(String registry) {this.registry = registry;}
	
	@Enumerated private StarshipClassEnum starshipClassEnum;
	public StarshipClassEnum getStarshipClassEnum() {return starshipClassEnum;}
	public void setStarshipClassEnum(StarshipClassEnum starshipClassEnum) {this.starshipClassEnum = starshipClassEnum;}
	
	
	@Enumerated private AffiliationEnum affiliationEnum;
	public AffiliationEnum getAffiliationEnum() {return affiliationEnum;}
	public void setAffiliationEnum(AffiliationEnum affiliationEnum) {this.affiliationEnum = affiliationEnum;}
	
	
	@Embedded private Physics physics;
	public Physics getPhysics() {return physics;}
	public void setPhysics(Physics physics) {this.physics = physics;}
	
	@OneToMany(mappedBy="starship", cascade={CascadeType.ALL}) 
	private List<Officer> officers = new ArrayList<Officer>();
	public List<Officer> getOfficers() {return Collections.unmodifiableList(officers);}
	public void setOfficers(List<Officer> officers) {this.officers = officers;}
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
