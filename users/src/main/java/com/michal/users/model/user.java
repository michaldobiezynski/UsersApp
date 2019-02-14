package com.michal.users.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;
        String firstname;
        String lastname;
        String role;
        String password;

        public user(){ }

        public user(Long id, String firstname, String lastname, String role, String password)
        {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.role = role;
            this.password = password;
        }


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString()
        {
            return "User{" + "id=" + id + ", Firstname=" + firstname + ", Lastname=" + lastname + ", Role=" + role + '}';
        }


}//end of class
