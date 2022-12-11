package com.nelson.secretario.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	Publicador dirigente;
	String local;

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grupo(Publicador dirigente, String local) {
		super();
		this.dirigente = dirigente;
		this.local = local;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Publicador getDirigente() {
		return dirigente;
	}

	public void setDirigente(Publicador dirigente) {
		this.dirigente = dirigente;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
