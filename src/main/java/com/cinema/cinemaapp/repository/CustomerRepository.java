package com.cinema.cinemaapp.repository;


import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Integer, Customer> {
    Customer deleteCustomerById(Integer id);
    Optional<Customer> findCustomerById(Integer id);
    Optional<Customer> findCustomerByEmail(String email);
    List<Customer> getAllCustomers();
}
