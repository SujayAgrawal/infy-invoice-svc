package com.infy.model;

public class SalesOrder {

	private Long id;

	private String salesOrderAmount;

	private String salesOrderDescription;

	public Long getSalesOrderId() {
		return id;
	}

	public void setSalesOrderId(Long salesOrderId) {
		this.id = salesOrderId;
	}

	public String getSalesOrderAmount() {
		return salesOrderAmount;
	}

	public void setSalesOrderAmount(String salesOrderAmount) {
		this.salesOrderAmount = salesOrderAmount;
	}

	public String getSalesOrderDescription() {
		return salesOrderDescription;
	}

	public void setSalesOrderDescription(String salesOrderDescription) {
		this.salesOrderDescription = salesOrderDescription;
	}

	@Override
	public String toString() {
		return "SalesOrder [salesOrderId=" + id + ", salesOrderAmount=" + salesOrderAmount + ", salesOrderDescription="
				+ salesOrderDescription + "]";
	}

}
