package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infy.model.Customer;
import com.infy.model.Invoice;
import com.infy.model.SalesOrder;

@Service
public class InvoiceService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${sales.order.uri}")
	private String salesOrderUri;

	// use of rest template to call sales order svc
	// no need of dao layer here as we will not be connecting to database
	public Invoice createInvoice(Customer customer) {
		SalesOrder salesOrder = restTemplate.getForObject(salesOrderUri, SalesOrder.class, customer.getOrderId());
		String amount = salesOrder.getSalesOrderAmount();
		Invoice invoice = new Invoice();
		invoice.setCustomer(customer);
		invoice.setAmount(Integer.valueOf(amount));
		return invoice;
	}

}
