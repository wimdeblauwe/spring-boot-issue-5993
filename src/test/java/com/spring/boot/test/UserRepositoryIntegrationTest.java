package com.spring.boot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
//@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository repository;

    @Test(expected = DataIntegrityViolationException.class)
    public void test() {
        repository.save(new User(1L, "wim", "123456"));
        repository.save(new User(2L, "wim", "123456"));
    }
}
