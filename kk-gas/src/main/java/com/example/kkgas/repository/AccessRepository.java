package com.example.kkgas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kkgas.entity.Access;

@Repository
public interface AccessRepository extends JpaRepository<Access, Integer> {

	Access findByAccessName(String accessName);

}