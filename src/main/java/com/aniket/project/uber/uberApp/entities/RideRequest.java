package com.aniket.project.uber.uberApp.entities;

import com.aniket.project.uber.uberApp.entities.enums.PaymentMethod;
import com.aniket.project.uber.uberApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RideRequest {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(columnDefinition = "Geometry(Point, 4326)")
private Point pickupLocation;

@Column(columnDefinition = "Geometry(Point, 4326)")
private Point dropLocation;
@CreationTimestamp
private LocalDateTime requestedTime;

@ManyToOne(fetch = FetchType.LAZY)
private Rider rider;
@Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
@Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

}
