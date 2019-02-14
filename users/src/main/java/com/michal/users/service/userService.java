package com.michal.users.service;

import com.michal.users.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userService
        extends JpaRepository<user, Long>
{
    Iterable<user> findByFirstnameAndLastname(String firstname, String lastname);
    Iterable<user> findByFirstname(String firstname);
    Iterable<user> findByLastname(String lastname);



}//end of userService
