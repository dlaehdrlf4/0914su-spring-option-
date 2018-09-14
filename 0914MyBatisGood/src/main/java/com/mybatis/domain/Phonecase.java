package com.mybatis.domain;

public class Phonecase {
	private Integer code;
	private String name;
	private Integer price;
	private String des;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Phonecase [code=" + code + ", name=" + name + ", price=" + price + ", des=" + des + "]";
	}
	
	
	
	
}
