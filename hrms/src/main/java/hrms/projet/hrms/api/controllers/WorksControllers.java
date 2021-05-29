package hrms.projet.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.projet.hrms.business.abstracts.WorkService;
import hrms.projet.hrms.entities.concrete.Work;


@RestController
@RequestMapping("/api/works")
public class WorksControllers {
	private WorkService workService;
	
	@Autowired
	public WorksControllers(WorkService workService) {
		super();
		this.workService=workService;
	}
	
	@GetMapping("/getall")
	public List<Work> getAll(){
		return this.workService.getAll();
	}
	
	@PostMapping("/add")

	public void add(@RequestBody Work work) {
		this.workService.add(work);
	}

}
