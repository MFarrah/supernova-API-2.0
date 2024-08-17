package nl.mfarr.supernova.services;

import nl.mfarr.supernova.entities.AdminEntity;
import nl.mfarr.supernova.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public AdminEntity createAdmin(AdminEntity admin) {
        return adminRepository.save(admin);
    }

    public AdminEntity getAdminByEmail(String email) {
        return adminRepository.findByEmail(email);
    }
}