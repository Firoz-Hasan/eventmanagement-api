package com.firoz.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.firoz.eventmanagement.entities.Venue;


public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
