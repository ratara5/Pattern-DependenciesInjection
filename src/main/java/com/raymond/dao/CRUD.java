package com.raymond.dao;

import java.util.List;

public interface CRUD<T> { //Uso de genéricos para abstraer más
    List<T> listarTodos();
    T leerPorId (int id);
    void registrar(T t);
    void actualizar(T t);
    void eliminar(int id);

} //Se pueden crear métodos comunes a MedicoDAOImpl, PersonaDAOImpl y cualquier otro modelo que se cree? En dónde?
