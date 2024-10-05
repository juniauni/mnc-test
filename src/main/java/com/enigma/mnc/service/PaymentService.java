package com.enigma.mnc.service;

import com.enigma.mnc.model.entity.Payment;
import com.enigma.mnc.model.request.PaymentRequest;
import com.enigma.mnc.model.response.PaymentResponse;

import java.util.List;

public interface PaymentService {
    PaymentResponse create(PaymentRequest paymentRequest);
}
