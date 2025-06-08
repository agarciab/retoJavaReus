package com.vn.reus.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.vn.reus.entity.Sospechoso;

public interface SospechosoRepository extends CrudRepository<Sospechoso, UUID> {

	List<Sospechoso> findAll();
}
