package com.enigma.mnc.model.response;

import com.enigma.mnc.model.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {
    private String paymentId;
    private LocalDateTime transDate;
    private Customer customerResponse;
    private Long nominal;
}
