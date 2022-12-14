package com.nelson.secretario.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelson.secretario.domain.Publicador;
import com.nelson.secretario.repositories.PublicadorRepository;

@Service
public class DBService {

	@Autowired
	private PublicadorRepository publicadorRep;

	public void instaciaBaseDeDados() {
		Date date = new Date();
		Publicador pub = new Publicador(null, "Nelson", 'S', date);

		this.publicadorRep.saveAll(Arrays.asList(pub));
	}

}
