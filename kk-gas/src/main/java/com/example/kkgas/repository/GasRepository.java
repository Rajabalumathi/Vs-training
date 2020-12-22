package com.example.kkgas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.kkgas.entity.Gas;

@Repository
public interface GasRepository extends JpaRepository<Gas, Integer> {
	@Query("select g from Gas g where g.gasId in (select min(p.gasId) from Gas p where p.gasStatus=0)")
	Gas findByGasStatus(Boolean val);
}
