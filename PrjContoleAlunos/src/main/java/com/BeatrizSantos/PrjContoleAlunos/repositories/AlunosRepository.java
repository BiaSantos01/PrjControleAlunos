package com.BeatrizSantos.PrjContoleAlunos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BeatrizSantos.PrjContoleAlunos.entities.Alunos;

public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}
