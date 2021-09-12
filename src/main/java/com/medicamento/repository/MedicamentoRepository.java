package com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicamento.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

}
