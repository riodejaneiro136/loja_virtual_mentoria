package jdev.mentoria.lojavirtual.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "pessoa_fisica")

public class PessoaFisica extends Pessoa {
	
	@PrimaryKeyJoinColumn(name = "id")

	private static final long serialVersionUID = 1L;

	@CPF(message = "CPF está inválido")
	@Column(nullable = false)
	private String cpf;

	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	
	@Transient
	private String senhaTemp;

	public void setSenhaTemp(String senhaTemp) {
		this.senhaTemp = senhaTemp;
	}
	
	public String getSenhaTemp() {
		return senhaTemp;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}