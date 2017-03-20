package com.michaelhoffmantech.jhipster.todoapp.repository;

import com.michaelhoffmantech.jhipster.todoapp.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
