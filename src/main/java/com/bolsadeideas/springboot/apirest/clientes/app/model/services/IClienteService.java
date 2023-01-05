package com.bolsadeideas.springboot.apirest.clientes.app.model.services;

import java.util.List;

import com.bolsadeideas.springboot.apirest.clientes.app.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
}
