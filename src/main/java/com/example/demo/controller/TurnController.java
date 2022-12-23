package com.example.demo.controller;

public class TurnController {
    // @Autowired
	// private ITurnService turnService;
	
	// @PostMapping("/registrar")
	// public ResponseEntity<Map<String, Object>> nuevoTurno(@Validated @RequestBody TurnDto turnDto){
	// 	Map<String, Object> response = new HashMap<>();
	// 	response.put("turno", turnService.save(turnDto));
	// 	response.put("mensaje", "Turno guardado con exito");
	// 	return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	// }
	
	// @GetMapping("/organization/{organizacion}")
	// public ResponseEntity<Map<String, Object>> buscarPorOrganizacion(@PathVariable(name="organizacion") String organizacion){
	// 	Map<String, Object> response = new HashMap<>();
	// 	response.put("turnos", turnService.findL(organizacion));
	// 	response.put("mensaje", "Busqueda realizada con exito");
	// 	return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	// }
	
	// @GetMapping("/organizacion/{organizacion}/evento/{evento}")
	// public ResponseEntity<Map<String, Object>> buscarPorOrganizacionYEvento(@PathVariable(name="organizacion") String organizacion, @PathVariable(name="evento") String evento){
	// 	Map<String, Object> response = new HashMap<>();
	// 	response.put("turnos", turnService.findId(organizacion, evento));
	// 	response.put("mensaje", "Busqueda realizada con exito");
	// 	return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	// }
}
