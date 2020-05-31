package com.firoz.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.firoz.eventmanagement.entities.Organizer;


public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
