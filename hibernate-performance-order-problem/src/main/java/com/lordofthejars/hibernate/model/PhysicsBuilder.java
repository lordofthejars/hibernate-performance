package com.lordofthejars.hibernate.model;

public class PhysicsBuilder {

	private Physics physics;
	
	public static PhysicsBuilder physics() {
		return new PhysicsBuilder();
	}
	
	private PhysicsBuilder() {
		super();
		this.physics = new Physics();
	}
	
	public PhysicsBuilder height(double height) {
		physics.setHeight(height);
		return this;
	}

	public PhysicsBuilder length(double length) {
		this.physics.setLength(length);
		return this;
	}
	
	public PhysicsBuilder power(String power) {
		this.physics.setPower(power);
		return this;
	}
	
	public PhysicsBuilder width(double width) {
		this.physics.setWidth(width);
		return this;
	}
	
	public Physics build() {
		return this.physics;
	}
	
}
