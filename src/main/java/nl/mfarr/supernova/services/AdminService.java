package nl.mfarr.supernova.services;

import nl.mfarr.supernova.dtos.AdminRequestDto;
import nl.mfarr.supernova.dtos.AdminResponseDto;
import nl.mfarr.supernova.entities.AdminEntity;
import nl.mfarr.supernova.mappers.AdminMapper;
import nl.mfarr.supernova.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminMapper adminMapper;

    public AdminResponseDto createAdmin(AdminRequestDto adminRequestDto) {
        AdminEntity adminEntity = adminMapper.toEntity(adminRequestDto);
        AdminEntity savedAdmin = adminRepository.save(adminEntity);
        return adminMapper.toDto(savedAdmin);
    }
}