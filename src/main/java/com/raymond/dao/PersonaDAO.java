package com.raymond.dao;

import com.raymond.model.Persona;

import java.util.List;

public interface PersonaDAO extends CRUD<Persona> {
    void setConnection(IConexion conexion);
}
