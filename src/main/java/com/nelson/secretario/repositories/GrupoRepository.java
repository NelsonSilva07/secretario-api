package com.nelson.secretario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelson.secretario.domain.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Integer>  {

}
