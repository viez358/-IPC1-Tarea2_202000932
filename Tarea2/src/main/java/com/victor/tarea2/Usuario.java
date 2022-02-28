/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victor.tarea2;

/**
 *
 * @author VO
 */
public class Usuario {
    
    private String nombreUsuario; /** Manejar en Privado para Acatar Buenas Normas de Programación */
    private String password; /** Guardará la Contraseña */
    
    
    public Usuario(String nombreUsuario, String password){
        this.nombreUsuario=nombreUsuario;
        this.password=password;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
