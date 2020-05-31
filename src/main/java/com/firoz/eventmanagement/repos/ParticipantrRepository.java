package com.firoz.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.firoz.eventmanagement.entities.Organizer;
import com.firoz.eventmanagement.entities.Participant;


public interface ParticipantrRepository extends PagingAndSortingRepository<Participant, Long> {

}
