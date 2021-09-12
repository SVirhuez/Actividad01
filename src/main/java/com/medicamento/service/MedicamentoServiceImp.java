package com.medicamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicamento.entity.Medicamento;
import com.medicamento.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImp implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repository;
	
	
	@Override
	public List<Medicamento> listaMedicamento() {
		
		return repository.findAll();
	}


	@Override
	public Medicamento insertaMedicamento(Medicamento a) {
		return repository.save(a);
	}

}
