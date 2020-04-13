package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.model.Customer;
import com.infy.model.Invoice;
import com.infy.service.InvoiceService;

@RestController
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceSvc;

	// create invoice for specific sales order id
	@PostMapping("/invoice")
	public ResponseEntity<Invoice> createInvoice(@RequestBody Customer customer) {
		return new ResponseEntity<>(invoiceSvc.createInvoice(customer), HttpStatus.OK);
	}
}
