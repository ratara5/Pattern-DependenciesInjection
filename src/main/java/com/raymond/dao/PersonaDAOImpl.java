package com.raymond.dao;

import com.raymond.model.Persona;

import java.util.List;

public class PersonaDAOImpl implements PersonaDAO{

    private IConexion conexion;
/*
    public PersonaDAOImpl(IConexion conexion) {
        this.conexion = conexion;
    }
*/
//@inject puede reemplazar las líneas 10 a 13
//posible usar la dependencia directamente en un método
@Override
public void setConnection(IConexion conexion){
        this.conexion=conexion;
    }


    @Override
    public List<Persona> listarTodos() {
        this.conexion.conectar();
        System.out.println("Listando...");
        return null;
        // Reemplazar por tomar de base de datos
    }

    @Override
    public Persona leerPorId(int id) {
        //Lógica
        return null;
    }

    @Override
    public void registrar(Persona persona) {
        System.out.println("Persona "+persona.getNombres()+" registrada");
    }

    @Override
    public void actualizar(Persona persona) {
        System.out.println("Persona "+persona.getNombres()+" actualizada");

    }

    @Override
    public void eliminar(int id) {
        System.out.println("id "+id+" eliminado");
    }
}
