package com.example.daw1_t1_Aguilar_Jorginho.controller;

import com.example.daw1_t1_Aguilar_Jorginho.model.Staff;
import com.example.daw1_t1_Aguilar_Jorginho.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping
    public List<Staff> findAll() {
        return staffService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Staff> findById(@PathVariable int id) {
        return staffService.findById(id);
    }

    @PostMapping
    public Staff save(@RequestBody Staff staff) {
        return staffService.save(staff);
    }

    @PutMapping("/{id}")
    public Staff update(@PathVariable int id, @RequestBody Staff staff) {
        staff.setStaffId(id);
        return staffService.save(staff);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        staffService.deleteById(id);
    }
}
