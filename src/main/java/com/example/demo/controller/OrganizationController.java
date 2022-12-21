package com.example.demo.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.OrganizationModel;
import com.example.demo.dto.OrganizationDto;
import com.example.demo.services.IOrganizationService;

@RestController
@RequestMapping("/Organization")
public class OrganizationController {
    
        private static final Logger log = LoggerFactory.getLogger(OrganizacionRestController.class);
        
        @Autowired
        private IOrganizationService organizationService;
        
        // Registrar una organizacion
        @PostMapping("/registrar")
        public ResponseEntity<Map<String, Object>> nuevaOrganizacion(@Valid @RequestBody OrganizationDto organizationDto){
            Map<String, Object> response = new HashMap<>();
            response.put("organizacion", organizationService.save(organizationDto));
            response.put("mensaje", "Organizacion registrada con exito");
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
    
        // Se envia en el cuerpo de la peticion la clave, y TODOS los campos(actualizados o no)
        @PutMapping("/actualizar")
        public ResponseEntity<Map<String, Object>> actualizarOrganizacion(@RequestBody OrganizationDto organizacionDto){
            Map<String, Object> response = new HashMap<>();
            response.put("organizacion", organizationService.update(organizacionDto));
            response.put("mensaje", "Organizacion actualizada con exito");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
    
        // Se envia en el cuerpo de la peticion la clave y el nombre de la organizacion
        // @PutMapping("/eliminar")
        // public ResponseEntity<Map<String, Object>> eliminarOrganizacion(@RequestBody OrganizationDto organizationDto){
        //     Map<String, Object> response = new HashMap<>();
        //     organizationService.eliminar(organizationDto);
        //     response.put("mensaje", "Organizacion eliminada con exito");
        //     return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        // }
        
        // Buscar todas las organizaciones ACTIVAS
        @GetMapping("/all")
        public ResponseEntity<Map<String, Object>> all(){
            Map<String, Object> response = new HashMap<>();
            response.put("organizaciones", organizationService.findAll());
            response.put("mensaje", "Busqueda realizada con exito");
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
        
        // Buscar una organizacion ACTIVA por nombre
        @GetMapping("/nombre/{nameOrg}")
        public ResponseEntity<Map<String, Object>> buscarPorNombre(@PathVariable(name = "nameOrg") String nameOrg){
            Map<String, Object> response = new HashMap<>();
            response.put("organizacion", organizationService.find(nameOrg));
            response.put("mensaje", "busqueda finalizada con exito");
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
        
        // Buscar una organizacion ACTIVA por nombre
        @GetMapping("/cuit/{Code}")
        public ResponseEntity<Map<String, Object>> buscarPorCuit(@PathVariable(name = "Code") String Code){
            Map<String, Object> response = new HashMap<>();
            response.put("organizacion", organizationService.findCode(Code));
            response.put("mensaje", "busqueda finalizada con exito");
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
       
   

}
