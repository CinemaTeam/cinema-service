package com.cinema.cinemaapp.service;

import com.cinema.cinemaapp.repository.CustomerRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
public class CustomerServiceTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public CustomerService customerService() {
            return new CustomerServiceImpl();
        }
    }

    @Before
    public void setUp() {
        Customer marti = new Customer();
        alex.setEmail("marti@wp.pl");

        Mockito.when(customerRepository.findCustomerByEmail(marti.getEmail()))
                .thenReturn(marti);
    }
 
    @Autowired
    private CustomerService customerService;
 
    @MockBean
    private CustomerRepository customerRepository;

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        String email = "marti@wp.pl";
        Customer found = customerService.findCustomerByEmail(email);

        assertThat(found.getEmail())
                .isEqualTo(email);
    }
}
