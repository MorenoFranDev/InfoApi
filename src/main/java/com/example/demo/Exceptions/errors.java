package com.example.demo.Exceptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class errors extends ResponseEntityExceptionHandler {
    @ExceptionHandler(KeyNotEqual.class)
    public ResponseEntity<Object> handleKeyNotEqual() {
        Map<String,Object> response = new HashMap<>();
        response.put("message", "Clave incorrecta.");
        return new ResponseEntity<Object>(response, HttpStatus.UNAUTHORIZED);
    }
	
	@ExceptionHandler(KeyIsNull.class)
	public ResponseEntity<Object> handleKeyIsNull(){
        Map<String,Object> response = new HashMap<>();
        response.put("message", "Para realizar esta accion se necesita una clave");
        return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NombreEventoExistente.class)
	public ResponseEntity<Object> handleNombreEventoExistente() {
        Map<String,Object> response = new HashMap<>();
        response.put("message", "Ya tienes un evento activo con el mismo nombre");
        return new ResponseEntity<Object>(response, HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(PersonaNoEncontrada.class)
	public ResponseEntity<Object> handlePersonaNoEncontrada() {
        Map<String,Object> response = new HashMap<>();
        response.put("message", "Persona no encontrada.");
        return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(OrganizacionNoEncontrada.class)
	public ResponseEntity<Object> handleOrganizacionNoEncontrada() {
        Map<String,Object> response = new HashMap<>();
        response.put("message", "Organizacion no encontrada.");
        return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EventoNoEncontrado.class)
	public ResponseEntity<Object> handleEventoNoEncontrada() {
        Map<String,Object> response = new HashMap<>();
        response.put("message", "Evento no encontrada.");
        return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FechaNecesaria.class)
	public ResponseEntity<Object> handleFechaNecesaria() {
        Map<String,Object> response = new HashMap<>();
        response.put("message", "El evento solicitado es recurrente y debe ingresar una fechaEvento");
        return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FechaTurnoRecurrenteOcupada.class)
	public ResponseEntity<Object> handleFechaTurnoRecurrenteOcupada() {
        Map<String,Object> response = new HashMap<>();
        response.put("message", "La fecha solicitada no está disponible");
        return new ResponseEntity<Object>(response, HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(javax.validation.ConstraintViolationException.class)
	public ResponseEntity<Object> constraintViolationException(javax.validation.ConstraintViolationException e){
        Map<String,Object> response = new HashMap<>();
        List<String> errorString = e.getConstraintViolations().stream().map(error -> error.getMessage().toString()).collect(Collectors.toList());
        response.put("message", errorString.toString());
        return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Object> dataIntegrityViolationException(DataIntegrityViolationException e){
		Map<String,Object> response = new HashMap<>();
		response.put("message", e.getMostSpecificCause().getMessage());
		return new ResponseEntity<Object>(response, HttpStatus.CONFLICT);
	}
}
