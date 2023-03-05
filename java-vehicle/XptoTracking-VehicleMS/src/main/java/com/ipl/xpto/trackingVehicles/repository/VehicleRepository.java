package com.ipl.xpto.trackingVehicles.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.xpto.trackingVehicles.model.Vehicle;


public interface VehicleRepository extends IBaseRepository<Vehicle, UUID> {
  List<Vehicle> findByNumberPlate(String numberPlate);

}