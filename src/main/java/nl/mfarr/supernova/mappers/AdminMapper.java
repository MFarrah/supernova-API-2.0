package nl.mfarr.supernova.mappers;

import nl.mfarr.supernova.dtos.AdminRequestDto;
import nl.mfarr.supernova.dtos.AdminResponseDto;
import nl.mfarr.supernova.entities.AdminEntity;
import org.springframework.stereotype.Component;

@Component
public class AdminMapper {

    public AdminEntity toEntity(AdminRequestDto dto) {
        AdminEntity entity = new AdminEntity();
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        return entity;
    }

    public AdminResponseDto toDto(AdminEntity entity) {
        AdminResponseDto dto = new AdminResponseDto();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setPhoneNumber(entity.getPhoneNumber());
        return dto;
    }
}