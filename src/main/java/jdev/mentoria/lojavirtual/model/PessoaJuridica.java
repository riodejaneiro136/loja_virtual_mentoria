package jdev.mentoria.lojavirtual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import org.hibernate.validator.constraints.br.CNPJ;

@Entity
@Table(name = "pessoa_juridica")

public class PessoaJuridica extends Pessoa {
	@PrimaryKeyJoinColumn(name = "id")
	private static final long serialVersionUID = 1L;

	@CNPJ(message = "Cnpj está inválido")
	@Column(nullable = false)
	private String cnpj;
	
	@Column(nullable = false)
	private String inscEstadual;
	
	private String inscMunicipal;
	
	@Column(nullable = false)
	private String nomeFantasia;
	
	@Column(nullable = false)
	private String razaoSocial;
	
	private String categoria;


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}