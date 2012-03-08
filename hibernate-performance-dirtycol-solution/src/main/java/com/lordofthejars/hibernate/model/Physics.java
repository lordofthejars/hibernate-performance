package com.lordofthejars.hibernate.model;

import javax.persistence.Embeddable;

@Embeddable
public class Physics {

	private String power;
	public String getPower() {return power;}
	public void setPower(String power) {this.power = power;}
	
	private double length;
	public double getLength() {return length;}
	public void setLength(double length) {this.length = length;}
	
	private double width;
	public double getWidth() {return width;}
	public void setWidth(double width) {this.width = width;}
	
	private double height;
	public double getHeight() {return height;}
	public void setHeight(double height) {this.height = height;}
	
	public Physics() {
		super();
	}

}
