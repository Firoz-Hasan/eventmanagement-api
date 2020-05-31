package com.firoz.eventmanagement.repos;

import java.time.ZoneId;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.firoz.eventmanagement.entities.Event;
import com.firoz.eventmanagement.entities.projections.PartialEventProjection;

@RepositoryRestResource(excerptProjection = PartialEventProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

	Page<Event> findByName(@Param("name") String name, Pageable pageable);

	Page<Event> findByNameAndZoneId(@Param("name") String name, @Param("zoneId") ZoneId zoneId, Pageable pageable);

	Page<Event> findByNameAndDescription(@Param("name") String name, @Param("description") String description,
			Pageable pageable);

	
	  @Query("select e FROM Event e WHERE e.id = ?1") 
	  Event eventName(@Param("id")Long id);
	 

	
//	  @Override
//	  
//	 @PreAuthorize("hasRole('ROLE_ADMIN)") 
//	  void delete (Long id);
	 
}
