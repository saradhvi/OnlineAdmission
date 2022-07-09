package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Payment;

public interface IPaymentService {
	public Payment addPayment(Payment payment);
	public List<Payment> viewAllPaymentDetails();
	public List<Payment> getPaymentDetailsByEmail(String emailId);
	public List<Payment> getPaymentDetailsByPayment(int paymentId);
	public List<Payment> getPaymentDetailsByApplication(int applicationId);
	public List<Payment> getPaymentDetailsByStatus(String paymentStatus);
	public int deletePaymentById(int paymentById);
	public int updatePaymentDetails(Payment payment);
	
	

}
