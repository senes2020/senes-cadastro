package com.project.senes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.senes.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long>{

	Beneficiario findById(long id);
	
}
