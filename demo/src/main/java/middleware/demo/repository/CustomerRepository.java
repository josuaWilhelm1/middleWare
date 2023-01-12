package middleware.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import middleware.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
