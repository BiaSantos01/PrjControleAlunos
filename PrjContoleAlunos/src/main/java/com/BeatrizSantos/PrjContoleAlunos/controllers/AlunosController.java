package com.BeatrizSantos.PrjContoleAlunos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeatrizSantos.PrjContoleAlunos.entities.Alunos;
import com.BeatrizSantos.PrjContoleAlunos.services.AlunosService;


@RestController
@RequestMapping("/alunos")
public class AlunosController {
	private final AlunosService alunosService;
	
	@Autowired
	public AlunosController (AlunosService alunosService) {
		this.alunosService = alunosService;
	}
	
	@PostMapping
	public Alunos createAlunos(@RequestBody Alunos alunos) {
		return alunosService.saveAlunos(alunos);
	}
	
	@GetMapping("/{id}")
	public Alunos getAlunos(@PathVariable Long id) {
		return alunosService.getAlunosById(id);
	}
	
	@GetMapping
	public List<Alunos> getAllAlunos() {
		return alunosService.getAllAlunos();
	}
	
	public void deleteAlunos(@PathVariable Long id) {
		alunosService.deleteAlunos(id);
	}
	
	
	

}