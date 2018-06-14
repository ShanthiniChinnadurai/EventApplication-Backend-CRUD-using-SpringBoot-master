package com.kgfsl.eventapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgfsl.eventapp.Event;

@Repository("eventRepository")
public interface EventRepository extends JpaRepository<Event, Long> {

}