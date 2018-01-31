package com.cinema.cinemaapp.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Customer customer = new Customer("Marti");
        entityManager.persist(customer);
        entityManager.flush();

        // when
        Customer found = customerRepository.findCustomerByEmail(customer.getEmail());

        // then
        assertThat(found.getEmail())
                .isEqualTo(customer.getEmail());
    }
}
