package com.nelson.secretario.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publicador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String endereco;
	private String telefone1;
	private String telefone2;
	private char sexo;
	private Date dtNascimento;
	private Date dtImersao;
	private boolean ungido = false;
	private boolean anciao = false;
	private boolean servo = false;
	private boolean pioneiro = false;
	private boolean ativo = true;
	private Integer grupo;
	private boolean saida = false;

	public Publicador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publicador(Integer id, String nome, char sexo, Date dt_nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dtNascimento = dt_nascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Date getDtImersao() {
		return dtImersao;
	}

	public void setDtImersao(Date dtImersao) {
		this.dtImersao = dtImersao;
	}

	public boolean isUngido() {
		return ungido;
	}

	public void setUngido(boolean ungido) {
		this.ungido = ungido;
	}

	public boolean isAnciao() {
		return anciao;
	}

	public void setAnciao(boolean anciao) {
		this.anciao = anciao;
	}

	public boolean isServo() {
		return servo;
	}

	public void setServo(boolean servo) {
		this.servo = servo;
	}

	public boolean isPioneiro() {
		return pioneiro;
	}

	public void setPioneiro(boolean pioneiro) {
		this.pioneiro = pioneiro;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getGrupo() {
		return grupo;
	}

	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	public boolean isSaida() {
		return saida;
	}

	public void setSaida(boolean saida) {
		this.saida = saida;
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
		Publicador other = (Publicador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
