package hrms.projet.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.projet.hrms.business.abstracts.JopSeekerService;

import hrms.projet.hrms.core.utilities.result.Result;
import hrms.projet.hrms.entities.concrete.JopSeeker;

@RestController
@RequestMapping("/api/jopseekers")
public class JopSeekersControllers {
	JopSeekerService jopSeekerService;
	
	@Autowired
	public JopSeekersControllers(JopSeekerService jopSeekerService) {
		this.jopSeekerService=jopSeekerService;
		
	}

	@PostMapping("/register")

	public Result register(@RequestBody JopSeeker jopSeeker) {
		return this.jopSeekerService.register(jopSeeker);
	}

		
}
