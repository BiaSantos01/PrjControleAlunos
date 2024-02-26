package com.BeatrizSantos.PrjContoleAlunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeatrizSantos.PrjContoleAlunos.entities.Alunos;
import com.BeatrizSantos.PrjContoleAlunos.repositories.AlunosRepository;


@Service
public class AlunosService {
	private final AlunosRepository alunosRepository;

	@Autowired
	public AlunosService(AlunosRepository alunosRepository) {
		this.alunosRepository = alunosRepository;
	}
	
	public Alunos saveAlunos(Alunos alunos) {
		return alunosRepository.save(alunos);
	}
	
	public Alunos getAlunosById(Long id) {
		return alunosRepository.findById(id).orElse(null);
	}
	
	public List<Alunos> getAllAlunos() {
		return alunosRepository.findAll();
	}
	
	public void deleteAlunos(Long id) {
		alunosRepository.deleteById(id);
	}
}