import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TurnDto;
import com.example.demo.services.ITurnService;

@RequestMapping("/person")
@RestController
public class PersonController {
    @Autowired
    private ITurnService turnService;


    @PostMapping("/registrar")
	public ResponseEntity<Map<String, Object>> nuevoEvento(@Valid @RequestBody TurnDto turnDto) {
		Map<String, Object> response = new HashMap<>();
		response.put("turno", turnService.save(turnDto));
		response.put("mensaje", "Turno: Guardado con exito");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}

    @PutMapping("/actualizar")
	public ResponseEntity<Map<String, Object>> actualizarEvento(@Valid @RequestBody TurnDto turnDto){
		Map<String, Object> response = new HashMap<>();
		response.put("turno", turnService.update(turnDto));
		response.put("mensaje", "Turno: Actualizado con exito");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}

    @GetMapping("/all")
	public ResponseEntity<Map<String, Object>> all(){
		Map<String, Object> response = new HashMap<>();
		response.put("turno", turnService.findAll());
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}

}
