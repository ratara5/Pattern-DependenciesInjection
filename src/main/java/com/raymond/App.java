package com.raymond;

import com.raymond.dao.*;

public class App {

    public static void main(String[] args) {
        IConexion cx=new ConexionPostgre("RaymonCon","7482","localhost");
        PersonaDAO dao=new PersonaDAOImpl(); //Buena práctica: trabajar orientado bajo interfaces para desacoplar el código
        dao.setConnection(cx);
        dao.listarTodos();

        IConexion cx2=new ConexionMySQL("RaymonCon","7482","192.168.1.1");
        //PersonaDAO dao2=new PersonaDAOImpl(cx2);
        //dao2.listarTodos();

    }

}
