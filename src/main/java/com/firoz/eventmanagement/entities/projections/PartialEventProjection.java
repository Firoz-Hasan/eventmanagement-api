package com.firoz.eventmanagement.entities.projections;


import java.time.Instant;
import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.firoz.eventmanagement.entities.Event;


@Projection(name = "partial", types = { Event.class })
@JsonPropertyOrder({"resourceId"})
public interface PartialEventProjection {


	Long getResourceId();
	
	String getName();

	ZonedDateTime getStartTime();

	ZonedDateTime getEndTime();
	
	@JsonIgnore
	Instant getCreated();
	
	@JsonProperty("desc")
	String getDescription();
	
}

