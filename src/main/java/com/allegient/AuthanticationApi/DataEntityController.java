package com.allegient.AuthanticationApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@DeleteMapping("/delete")
	public ResponseEntity<HttpStatus> deleteEntity(@PathVariable int dataEntityId) {
		try {
			this.entityService.deleteById(dataEntityId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
