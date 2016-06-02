package com.ryan.workstealing;

public class Transaction {

	public final static String GROCERY = "grocery";
	public final static String SHOPPING = "shopping";
	public final static String STANDBY = "standby";

	private Integer id;
	private String type;
	private Double value;
	
	public Transaction(Integer id, String type, Double value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Double getValue() {
		return value;
	}
}
