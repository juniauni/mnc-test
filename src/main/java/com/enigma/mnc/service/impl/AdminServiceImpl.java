package com.enigma.mnc.service.impl;

import com.enigma.mnc.model.entity.Admin;
import com.enigma.mnc.repository.AdminRepository;
import com.enigma.mnc.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    @Override
    public Admin create(Admin admin) {
        return adminRepository.save(admin);
    }
}
