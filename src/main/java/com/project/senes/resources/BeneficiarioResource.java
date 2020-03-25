package com.project.senes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.senes.model.Beneficiario;
import com.project.senes.repository.BeneficiarioRepository;

@RestController
@RequestMapping(value="/home")
public class BeneficiarioResource {
	
	@Autowired
	BeneficiarioRepository beneficiarioRepository;
	
	@GetMapping("/cadastro")
	public List<Beneficiario> listaCadastrados(){
		return beneficiarioRepository.findAll();
	}

	@GetMapping("/cadastro/{id}")
	public Beneficiario listaCadastradoPorId(@PathVariable(value="id") long id){
		return beneficiarioRepository.findById(id);
	}
	
	@PostMapping("/cadastro")
	public Beneficiario cadastrarBeneficiario(@RequestBody Beneficiario beneficiario) {
		return beneficiarioRepository.save(beneficiario);
	}
	
}






















