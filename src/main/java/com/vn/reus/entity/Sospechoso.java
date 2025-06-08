package com.vn.reus.entity;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SOSPECHOSOS")
@Getter
@Setter
@NoArgsConstructor
public class Sospechoso {

	@Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
	@Setter(AccessLevel.NONE)
    private UUID id;

    @Column(name = "NOMBRE")
    private String nombre;
    
    /** TODO: Completa la entidad con los campos faltantes */
}