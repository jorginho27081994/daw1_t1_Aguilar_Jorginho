package com.example.daw1_t1_Aguilar_Jorginho.service;

import com.example.daw1_t1_Aguilar_Jorginho.model.Staff;
import com.example.daw1_t1_Aguilar_Jorginho.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public List<Staff> findAll() {
        return staffRepository.findAll();
    }

    public Optional<Staff> findById(int id) {
        return staffRepository.findById(id);
    }

    public Staff save(Staff staff) {
        return staffRepository.save(staff);
    }

    public void deleteById(int id) {
        staffRepository.deleteById(id);
    }
}
