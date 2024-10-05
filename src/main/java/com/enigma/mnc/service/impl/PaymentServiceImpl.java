package com.enigma.mnc.service.impl;

import com.enigma.mnc.model.entity.Customer;
import com.enigma.mnc.model.entity.Payment;
import com.enigma.mnc.model.request.PaymentRequest;
import com.enigma.mnc.model.response.PaymentResponse;
import com.enigma.mnc.repository.PaymentRepository;
import com.enigma.mnc.service.PaymentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;
    private final CustomerServiceImpl customerService;

    @Transactional(rollbackOn = Exception.class)
    @Override
    public PaymentResponse create(PaymentRequest paymentRequest) {
        // TODO 1: validate customer
        Customer customer = customerService.getById(paymentRequest.getCustomerId());
        // TODO 2: create new payment
        Payment payment = Payment.builder()
                .customer(customer)
                .transDate(LocalDateTime.now())
                .nominal(paymentRequest.getNominal())
                .build();
        paymentRepository.saveAndFlush(payment);

        // TODO 3: Create response object and return
        return PaymentResponse.builder()
                .paymentId(payment.getId())
                .customerResponse(customer)
                .nominal(payment.getNominal())
                .transDate(payment.getTransDate())
                .build();
    }
}
