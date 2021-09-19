/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crist
 */

import java.util.*;

/**
 * 
 */
public class Suscriptor {

    /**
     * Default constructor
     */
    public Suscriptor() {
    }

    public Suscriptor(long codigo, char estado, int periodicidad) {
        this.codigo = codigo;
        this.estado = estado;
        this.periodicidad = periodicidad;
    }




    private long codigo;
    private char estado;
    private int periodicidad;
    
    
    public long CalcularPago() {
        long pago = 0;
        if(estado == 'V' || estado == 'v'){
            
            switch(periodicidad){
                case 1: pago =  30000;
                    break;
                case 2: pago =  70000;
                    break;
                case 3: pago =  150000;
                    break;
                case 4: pago =  270000;
                    break;
            }
            
        } else if(estado == 'S' || estado == 's') pago = 0;
        
        return pago;
        
    }
    
    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

}