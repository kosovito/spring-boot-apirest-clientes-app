package com.bolsadeideas.springboot.apirest.clientes.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.apirest.clientes.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
