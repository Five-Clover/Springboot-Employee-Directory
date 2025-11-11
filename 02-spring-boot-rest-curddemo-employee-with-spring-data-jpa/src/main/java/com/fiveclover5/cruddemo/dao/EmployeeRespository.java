package com.fiveclover5.cruddemo.dao;

import com.fiveclover5.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
        // that's it .... no need to write any code LOL!!!!
}
