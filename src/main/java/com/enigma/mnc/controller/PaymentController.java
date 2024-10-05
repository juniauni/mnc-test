package com.enigma.mnc.controller;

import com.enigma.mnc.constant.AppPath;
import com.enigma.mnc.model.request.PaymentRequest;
import com.enigma.mnc.model.response.CommonResponse;
import com.enigma.mnc.model.response.PaymentResponse;
import com.enigma.mnc.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppPath.PAYMENT)
public class PaymentController {
    private final PaymentService paymentService;
    @PostMapping
    private ResponseEntity<?> createNewPayment(@RequestBody PaymentRequest paymentRequest){
        PaymentResponse paymentResponse1 = paymentService.create(paymentRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully created new payment")
                        .data(paymentResponse1)
                        .build());
    }
}
