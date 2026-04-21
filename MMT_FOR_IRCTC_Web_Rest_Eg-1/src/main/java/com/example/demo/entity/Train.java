package com.example.demo.entity;

public class Train {

	private int Id;
	private String name;
	private String dest;
	private String source;
	private int platfromNo;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getPlatfromNo() {
		return platfromNo;
	}
	public void setPlatfromNo(int platfromNo) {
		this.platfromNo = platfromNo;
	}
	
	
}
