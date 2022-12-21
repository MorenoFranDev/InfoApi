import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.EventDto;
import com.example.demo.services.IEventService;

public class EventController {
    @Autowired
	private IEventService eventService;
	
	@PostMapping("/registrar")
	public ResponseEntity<Map<String, Object>> nuevoEvento(@Valid @RequestBody EventDto eventDto) {
		Map<String, Object> response = new HashMap<>();
		response.put("evento", eventService.save(eventDto));
		response.put("mensaje", "Evento guardado con exito");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Map<String, Object>> actualizarEvento(@Valid @RequestBody EventDto eventoDto){
		Map<String, Object> response = new HashMap<>();
		response.put("evento", eventService.update(eventoDto));
		response.put("mensaje", "Evento actualizado con exito");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
	
	// Eliminacion de un evento(logica -> Atributo estado FALSE)
	
	@GetMapping("/all")
	public ResponseEntity<Map<String, Object>> all(){
		Map<String, Object> response = new HashMap<>();
		response.put("organizaciones", eventService.findAll());
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
	
	// Buscar los eventos de una organizacion determinada
	@GetMapping("organizacion/{organizacion}")
	public ResponseEntity<Map<String, Object>> buscarPorOrganizacion(@PathVariable(name = "organization") String organization){
		Map<String, Object> response = new HashMap<>();
		response.put("organizaciones", eventService.findByOrganization(organization));
		response.put("mensaje", "Busqueda finalizada con exito");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
}
