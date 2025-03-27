package com.aniket.project.uber.uberApp.dto;

import com.aniket.project.uber.uberApp.entities.Driver;
import com.aniket.project.uber.uberApp.entities.Rider;
import com.aniket.project.uber.uberApp.entities.enums.PaymentMethod;
import com.aniket.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {

    private Long id;


    private Point pickupLocation;

    private Point dropLocation;

    private LocalDateTime createdTime;


    private DriverDto driver;

    private RiderDto rider;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
