package com.example91.demo91;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
    {
        "id": 0,
        "name": "nameee",
        "age": 23,
        "active": false
    }
 */
@RestController
public class CustomerController {
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("nameee", 23));

		return customers;
	}

	@PostMapping(value = "/customers/create")
	public Customer postCustomer(@RequestParam("rp") String str, @RequestBody Customer customer) {
		System.out.println(str+" customer is "+customer);
		return customer;
	}

	@DeleteMapping("/customers/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
		System.out.println("Delete Customer with ID = " + id + "...");

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}

	@DeleteMapping("/customers/delete")
	public ResponseEntity<String> deleteAllCustomers() {
		System.out.println("Delete All Customers...");

		return new ResponseEntity<>("All customers have been deleted!", HttpStatus.OK);
	}

	@GetMapping(value = "customers/age/{age}")
	public List<Customer> findByAge(@PathVariable int age) {

		List<Customer> lc = new ArrayList<Customer>();
		lc.add(new Customer("ssssss", age));
		
		return lc;
	}

	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) throws CustomerIdInvalidException{
		System.out.println("Update Customer with ID = " + id + "...");

		if(id < 0) {
			throw new CustomerIdInvalidException(LocalDateTime.now(), "/customers/id", "Permanent");
		}
		else if(id>20 && id<30) {
			throw new CustomerAlreadyExistsException(LocalDateTime.now(), "/customers/id", "CustomerAlreadyExistsException");
		}
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
}
