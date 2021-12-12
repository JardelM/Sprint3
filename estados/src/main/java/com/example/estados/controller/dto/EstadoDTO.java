package com.example.estados.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.example.modelo.Estado;

public class EstadoDTO {

	private int id;
	private String nome;
	private String regiao;
	private Integer populacao;
	private String capital;
	private Double area;

	public EstadoDTO(Estado estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.capital = estado.getCapital();
		this.area = estado.getArea();
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public Integer getPopulacao() {
		return populacao;
	}

	public String getCapital() {
		return capital;
	}

	public Double getArea() {
		return area;
	}

	public static List<EstadoDTO> converter(List<Estado> estado) {
		return estado.stream().map(EstadoDTO::new).collect(Collectors.toList());

	}

}
