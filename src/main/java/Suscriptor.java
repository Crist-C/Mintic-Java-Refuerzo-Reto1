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

    public Suscriptor(int codigo, String estado, int periodicidad) {
        this.codigo = codigo;
        this.estado = estado;
        this.periodicidad = periodicidad;
    }


    private int codigo;
    private String estado;
    private int periodicidad;
    
    
    public int CalcularPago() {
        
        
        return 1;
    }

}