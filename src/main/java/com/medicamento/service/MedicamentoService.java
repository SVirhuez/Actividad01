package com.medicamento.service;

import java.util.List;


import com.medicamento.entity.Medicamento;

public interface MedicamentoService {

	public abstract List<Medicamento> listaMedicamento();
	public abstract Medicamento insertaMedicamento(Medicamento a);
}
