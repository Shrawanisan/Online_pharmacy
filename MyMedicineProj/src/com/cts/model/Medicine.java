package com.cts.model;

public class Medicine {
	
	
	private String id;
	private String name;
	private String unitValue;
	private String expiryDate;
	private String type;
	private double price;
	private String inStock;
	private String unit;

	public Medicine(String name2, String type2, String unitValue2,
			double price2, String inStock2) {
		this.name=name2;
		this.type=type2;
		this.unitValue=unitValue2;
		this.price=price2;
		this.inStock=inStock2;
		
	}
	
	public Medicine() {
		// TODO Auto-generated constructor stub
	}


	public Medicine(String name2, String type2, String unitValue2,
			String unit2, double price2, String inStock2) {
		this.name=name2;
		this.type=type2;
		this.unitValue=unitValue2;
		this.unit=unit2;
		this.price=price2;
		this.inStock=inStock2;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnitValue() {
		return unitValue;
	}
	public void setUnitValue(String unitValue) {
		this.unitValue = unitValue;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInStock() {
		return inStock;
	}
	public void setInStock(String inStock) {
		this.inStock = inStock;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}	
	
	

