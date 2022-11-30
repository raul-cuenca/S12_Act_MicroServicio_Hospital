package pe.cuenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.cuenca.model.Hospital;
import pe.cuenca.service.HospitalService;

@Controller
@RequestMapping("/api/hospital/v1")
public class HospitalController {

	@Autowired
	private HospitalService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Hospital> listar() {
		return service.listar();
	}
	
	
	
}
