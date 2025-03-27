package com.aniket.project.uber.uberApp.services;

import com.aniket.project.uber.uberApp.dto.DriverDto;
import com.aniket.project.uber.uberApp.dto.RideDto;
import com.aniket.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface DriverService {
RideDto acceptRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endedRide(Long rideId);
    RideDto rateRider(Long rideId,Integer reting);
    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();
}
