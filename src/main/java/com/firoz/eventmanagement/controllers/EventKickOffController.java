package com.firoz.eventmanagement.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firoz.eventmanagement.entities.Event;
import com.firoz.eventmanagement.repos.EventRepository;


@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

	@Autowired
	private EventRepository eventRepository;

	@PostMapping("/start/{id}")
	public ResponseEntity start(@PathVariable Long id) {
		Event event = eventRepository.findById(id).orElse(null);

		if (event == null) {
			throw new ResourceNotFoundException();
		}
		event.setStarted(true);
		eventRepository.save(event);

		return ResponseEntity.ok(event.getName() + " has started");
	}
	
	
	@PostMapping("/testing")
	public @ResponseBody ResponseEntity<String> test(@RequestParam Long id) {
		Event event = (Event) eventRepository.eventName(id);

		System.out.println(id+" "+event.getName()+" "+ event.getDescription());
		
		if (event == null) {
			throw new ResourceNotFoundException();
		}
		//event.setStarted(true);
		//eventRepository.save(event);

	//	return ResponseEntity.ok(event.getName() + " is the name");
		
		return ResponseEntity.ok(event.getName() + " is the name");
	}
	
	
	
	

}
