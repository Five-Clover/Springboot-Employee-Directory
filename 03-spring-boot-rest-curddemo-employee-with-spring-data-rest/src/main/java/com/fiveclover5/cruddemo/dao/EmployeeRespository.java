package com.fiveclover5.cruddemo.dao;

import com.fiveclover5.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
        // that's it .... no need to write any code LOL!!!!
}
