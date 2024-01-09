package com.naeli.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.naeli.workshopmongo.dto.UserDTO;
import com.naeli.workshopmongo.services.UserServices;


@RestController
@RequestMapping(value="/users")
public class UserResources {

	@Autowired
	private UserServices service;
	
	@RequestMapping(method=RequestMethod.GET)
 	public ResponseEntity<List<UserDTO>> findAll() {
		List<com.naeli.workshopmongo.domain.User> list = service.findAll();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}