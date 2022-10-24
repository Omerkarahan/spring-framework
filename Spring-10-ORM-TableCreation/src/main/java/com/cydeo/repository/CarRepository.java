package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // u do not need to add annotation , it still works
public interface CarRepository extends JpaRepository<Car,Long> {


}
