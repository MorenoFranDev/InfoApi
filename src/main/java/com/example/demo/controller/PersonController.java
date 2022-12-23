package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/person")
@RestController
public class PersonController {
    // @Autowired
    // private ITurnService turnService;


    // @PostMapping("/registrar")
	// public ResponseEntity<Map<String, Object>> nuevoEvento(@Validated @RequestBody TurnDto turnDto) {
	// 	Map<String, Object> response = new HashMap<>();
	// 	response.put("turno", turnService.save(turnDto));
	// 	response.put("mensaje", "Turno: Guardado con exito");
	// 	return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	// }

    // @PutMapping("/actualizar")
	// public ResponseEntity<Map<String, Object>> actualizarEvento(@Validated @RequestBody TurnDto turnDto){
	// 	Map<String, Object> response = new HashMap<>();
	// 	response.put("turno", turnService.update(turnDto));
	// 	response.put("mensaje", "Turno: Actualizado con exito");
	// 	return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	// }

    // @GetMapping("/all")
	// public ResponseEntity<Map<String, Object>> all(){
	// 	Map<String, Object> response = new HashMap<>();
	// 	response.put("turno", turnService.findAll());
	// 	return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	// }

}
