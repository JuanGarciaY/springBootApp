package com.appspring.completa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appspring.completa.model.Role;



@Repository //Si no se pone esta notacion, no se va a poder interpretar la interfaz y no va a poder hacer nada con el
public interface IRoleRepository extends CrudRepository<Role, Long>{

}