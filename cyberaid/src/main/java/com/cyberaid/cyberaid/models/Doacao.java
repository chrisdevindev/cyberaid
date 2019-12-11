
package com.cyberaid.cyberaid.models;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Doacao  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private long id;
	@Column(nullable=false)
	private double valor;
	
 
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	private Ong Ong;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	private Doador Doador;
	
	
	@Override
	public String toString() {
		return 
		   "Id: "+ this.id+
	       "\nValor: "+this.valor+
	       "\nOng:" + this.Ong.getId()+
	       "\nDoador:" + this.Ong.getId();
	 	
	}

	public Doador getDoador() {
		return Doador;
	}

	public void setDoador(Doador doador) {
		Doador = doador;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Ong getOng() {
		return Ong;
	}

	public void setOng(Ong Ong) {
		this.Ong = Ong;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	


	
}
