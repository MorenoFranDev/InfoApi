package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.TurnDto;
import com.example.demo.services.ITurnService;

public class TurnController {
    @Autowired
	private ITurnService turnService;
	
	@PostMapping("/registrar")
	public ResponseEntity<Map<String, Object>> nuevoTurno(@Valid @RequestBody TurnDto turnDto){
		Map<String, Object> response = new HashMap<>();
		response.put("turno", turnService.save(turnDto));
		response.put("mensaje", "Turno guardado con exito");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/organization/{organizacion}")
	public ResponseEntity<Map<String, Object>> buscarPorOrganizacion(@PathVariable(name="organizacion") String organizacion){
		Map<String, Object> response = new HashMap<>();
		response.put("turnos", turnService.findL(organizacion));
		response.put("mensaje", "Busqueda realizada con exito");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/organizacion/{organizacion}/evento/{evento}")
	public ResponseEntity<Map<String, Object>> buscarPorOrganizacionYEvento(@PathVariable(name="organizacion") String organizacion, @PathVariable(name="evento") String evento){
		Map<String, Object> response = new HashMap<>();
		response.put("turnos", turnService.findId(organizacion, evento));
		response.put("mensaje", "Busqueda realizada con exito");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
}
