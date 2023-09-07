package com.RESTAPI.Repository;


import com.RESTAPI.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
    // all crud database methods
}
