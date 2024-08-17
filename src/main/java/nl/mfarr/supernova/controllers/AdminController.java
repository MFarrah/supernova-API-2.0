package nl.mfarr.supernova.controllers;

import nl.mfarr.supernova.entities.AdminEntity;
import nl.mfarr.supernova.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/create")
    public ResponseEntity<AdminEntity> createAdmin(@RequestBody AdminEntity admin) {
        AdminEntity savedAdmin = adminRepository.save(admin);
        return ResponseEntity.ok(savedAdmin);
    }
}
