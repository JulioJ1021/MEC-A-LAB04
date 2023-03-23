package com.mycompany.afiliados;

public class Afiliados {
    int edad, turn;
    String nombre, apellido, plan_comp;
    boolean cond_esp;

    public Afiliados(int edad, String nombre, String apellido, String plan_comp, boolean cond_esp) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.plan_comp = plan_comp;
        this.cond_esp = cond_esp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPlan_comp() {
        return plan_comp;
    }

    public void setPlan_comp(String plan_comp) {
        this.plan_comp = plan_comp;
    }

    public boolean isCond_esp() {
        return cond_esp;
    }

    public void setCond_esp(boolean cond_esp) {
        this.cond_esp = cond_esp;
    }
    
}