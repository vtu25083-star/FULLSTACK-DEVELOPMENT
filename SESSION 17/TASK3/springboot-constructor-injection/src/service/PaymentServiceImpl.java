package com.example.payment.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String makePayment(double amount) {
        return "Payment of ₹" + amount + " processed successfully";
    }
}
