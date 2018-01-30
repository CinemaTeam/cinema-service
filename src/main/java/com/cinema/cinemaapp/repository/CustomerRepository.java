package com.cinema.cinemaapp.repository;



public interface CustomerRepository extends CrudRepository<Long, Customer> {
    Customer deleteCustomerById(Long id);
    Customer findCustomerById(Integer id);
    Customer findCustomerByEmail(String email);
    List<Customer> findAll();
}
