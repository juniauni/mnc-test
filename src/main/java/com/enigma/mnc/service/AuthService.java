package com.enigma.mnc.service;

import com.enigma.mnc.model.request.AuthRequest;
import com.enigma.mnc.model.response.LoginResponse;
import com.enigma.mnc.model.response.RegisterResponse;

public interface AuthService {
    RegisterResponse registerCustomer(AuthRequest request);

    RegisterResponse registerAdmin(AuthRequest request);

    LoginResponse login(AuthRequest authRequest);
}
