package br.edu.ifsp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.data.vo.PersonVO;
import br.edu.ifsp.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	//private PersonVOServices person = new PersonVOServices();
	@Autowired
	private PersonServices services;
	
	@RequestMapping(method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PersonVO> findAll() {
		return services.findAll();
	}
	
	@RequestMapping(value= "/{id}", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonVO findById(@PathVariable("id") Long id) {
		return services.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonVO create(@RequestBody PersonVO person) {
		return services.create(person);
	}
	
	@RequestMapping(method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonVO update(@RequestBody PersonVO person) {
		return services.update(person);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		services.delete(id);
	}
}
