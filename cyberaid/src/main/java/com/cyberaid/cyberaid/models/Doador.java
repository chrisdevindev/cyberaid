package com.cyberaid.cyberaid.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doador {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
//@Column(nullable=false)
private Long id;
@Column(nullable=false)
private String nome;
@Column(nullable=false)
private String cpf_cnpj;
@Column(nullable=false)
private String email;
@Column(nullable=false)
private String usuario;
@Column(nullable=false)
private String senha;
@Column(nullable=false)
private String endereco;
@Column(nullable=false)
private String telefone;
@Column(nullable=false)
private String cidade;
@Column(nullable=false)
private String cep; 
@Column(nullable=false)
private String estado;


@Override
public String toString() {
	return 
	"Id: "+ this.id+
	"\nNome: "+this.nome+
	"\nCPF: "+this.cpf_cnpj+
	"\nE-mail: "+this.email+
	"\nUsu�rio: "+this.usuario+
	"\nSenha: "+this.senha+
	"\nEndere�o: "+this.endereco+
	"\nTelefone: "+this.telefone+
	"\nCidade: "+this.cidade+
	"\nCEP: "+this.cep+
	"\nEstado: "+this.estado;

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
public String getCpf_cnpj() {
	return cpf_cnpj;
}
public void setCpf_cnpj(String cpf_cnpj) {
	this.cpf_cnpj = cpf_cnpj;
}
}
