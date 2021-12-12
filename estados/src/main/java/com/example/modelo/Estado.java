package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Estado {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String regiao;
	private Integer populacao;
	private String capital;
	private Double area;

	public Estado(int id, String nome, String regiao, Integer populacao, String capital, Double area) {
		this.id = id;
		this.nome = nome;
		this.regiao = regiao;
		this.populacao = populacao;
		this.capital = capital;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public Integer getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

}
