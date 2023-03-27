package com.mycompany.parqueadero;
import java.time.LocalDateTime;
/*
 * @author julio
 */
public class Vehiculo {
    int hora, minutos, num_vehiculo;
    String placa, tipo_v;

    public Vehiculo(int hora, int minutos, String placa, String tipo_v, int num_vehiculo) {
        this.hora = hora;
        this.minutos = minutos;
        this.placa = placa;
        this.tipo_v = tipo_v;
        this.num_vehiculo = num_vehiculo;
    }

    public int getNum_vehiculo() {
        return num_vehiculo;
    }

    public void setNum_vehiculo(int num_vehiculo) {
        this.num_vehiculo = num_vehiculo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_v() {
        return tipo_v;
    }

    public void setTipo_v(String tipo_v) {
        this.tipo_v = tipo_v;
    }
    
    public int Minutos_Pagar(){
        LocalDateTime tiempo = LocalDateTime.now();
        int minut = (tiempo.getHour() - this.hora)*60 +(tiempo.getMinute() - this.minutos);
        return minut;
    }

    public int Num_rueda() {
        if("Carro".equals(this.tipo_v))
            return 4;
        return 2;
    }
    
}
