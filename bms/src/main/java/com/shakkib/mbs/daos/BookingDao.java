package com.shakkib.mbs.daos;

import com.shakkib.mbs.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Integer> {
}
