package com.enigma.mnc.service;

import com.enigma.mnc.model.entity.Role;

public interface RoleService {
    Role getOrSave(Role role);
}
