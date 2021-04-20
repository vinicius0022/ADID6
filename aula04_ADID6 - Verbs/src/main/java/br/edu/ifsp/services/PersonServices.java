package br.edu.ifsp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.edu.ifsp.model.Person;

@Service
public class PersonServices {
	
	private AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Vinicius");
		person.setLastName("Santos");
		person.setAdress("Rua Bla Bla, 506 - Vila Velha");
		person.setGender("Male");
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0; i < 10; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}
	
	public Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Nome da pessoa " + i);
		person.setLastName("Sobrenome da pessoa " + i);
		person.setAdress("Um endereço xis " + i);
		person.setGender("Male");
		return person;
	}
}
