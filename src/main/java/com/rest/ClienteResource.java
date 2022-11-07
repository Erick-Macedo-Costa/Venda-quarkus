package com.rest;

import com.model.Cliente;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;


public interface ClienteResource extends PanacheEntityResource<Cliente, Long> {

}