package com.cyberaid.cyberaid.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Ong {

	@Id
	@GeneratedValue
//	@Column(nullable=false)
	private Long id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cnpj;
	@Column(nullable=false)
	private String telefone;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String usuario;
	@Column(nullable=false)
	private String senha;
	@Column(nullable=false)
	private String endereco;
	@Column(nullable=false)
	private String cidade;
	@Column(nullable=false)
	private String estado;
	@Column(nullable=false)
	private String cep;
	
	
	public String toString() {
		String retorno = "";
		retorno += "\n Id: " + id; // retorno = retorno + "\n Id: " + id;
		retorno += "\n Nome: " + nome;
		retorno += "\n CNPJ: " + cnpj;
		retorno += "\n Telefone: " + telefone;
		retorno += "\n Email: " + email;
		retorno += "\n Usu�rio: " + usuario;
		retorno += "\n Senha: " + senha;
		retorno += "\n Endere�o: " + endereco;
		retorno += "\n Cidade: " + cidade;
		retorno += "\n Estatado: " + estado;
		retorno += "\n Cep: " + cep;

		return retorno;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
