package com.allegient.AuthanticationApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class DataEntityController {

	@Autowired
    private DataEntityServices entityService;
	
	@GetMapping("/view")
	public List<DataEntity> getEntity() {
		return this.entityService.getEntity();
	}
	
	
	@PostMapping("/add")
	public DataEntity addEntity(@RequestBody DataEntity e) {
		return this.entityService.addEntity(e);
	}
	
}
