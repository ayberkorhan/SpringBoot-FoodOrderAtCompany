package com.example.foodDelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.foodDelivery.Model.EmployeModel;

public interface EmployeRepository extends CrudRepository<EmployeModel, String> {

}
