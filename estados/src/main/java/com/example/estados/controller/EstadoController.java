package com.example.estados.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.estados.controller.dto.EstadoDTO;
import com.example.modelo.Estado;


@RestController
public class EstadoController {
	
	
	@RequestMapping("/states")
	@ResponseBody
	public List<EstadoDTO> lista() {
		
		Estado estado = new Estado(1, "Mnas Gerais", "Sudeste", 21411923, "Belo Horizonte", 586528.00);
		
		return EstadoDTO.converter(Arrays.asList(estado, estado, estado));
		
	}
}
