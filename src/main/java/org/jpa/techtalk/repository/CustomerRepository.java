package org.jpa.techtalk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.techtalk.jpa.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
/*	@Async
	 @Query("SELECT name FROM customer t where name='XYZ'");
	    String findCustomerByName(@Param("name") String name);*/
}
