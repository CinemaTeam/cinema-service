package com.cinema.cinemaapp.repository;



public interface CustomerRepository extends CrudRepository<Integer, Customer> {
    Customer deleteCustomerById(Integer id);
    Customer findCustomerById(Integer id);
    Customer findCustomerByEmail(String email);
    List<Customer> findAll();
}
