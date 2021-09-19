/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crist
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    
    public static void main (String [] args){
        
        Scanner consola = new Scanner(System.in);
        
        int N_Suscriptores;
        long codigo;
        char estado;
        int periodicidad;
        long pagoTotal = 0;
        Suscriptor suscriptores[];
        
        
        System.out.println("------------------------------------");
        System.out.println("----  MINTIC - RETO DE REFUERZO ----");
        System.out.println("----                            ----");
        System.out.println("----  Liquidación servicio de   ----");
        System.out.println("----  suscripción a periódico   ----");
        System.out.println("----                            ----");
        System.out.println("------------------------------------");
        
        System.out.println("\nIngrese la cantidad de suscriptores: ");
        N_Suscriptores = consola.nextInt();
        suscriptores = new Suscriptor[N_Suscriptores];
        
        for(int i = 0; i < N_Suscriptores; i++){
            
            System.out.println("----------------------------------------");
            System.out.println("||   INFORMACIÓN DEL                   ||");
            System.out.println("||            SUSCRIPTOR "+(i+1)+"         ||");
            System.out.println("----------------------------------------");
            
            System.out.println("Ingrese el número del código : ");
            codigo = consola.nextInt();
            System.out.println("Ingrese el estado del cliente (V=Vigente, S=Suspendido) : ");
            estado = consola.next().charAt(0);
            
            System.out.println("Ingrese el número que corresponda a la periodicidad: ");
            System.out.println("_____________________________________________");
            System.out.println("|   Periodicidad     |     Valor a Pagar     |");
            System.out.println("|____________________________________________|");
            System.out.println("|        1           |        $30.000        |");
            System.out.println("|        2           |        $70.000        |");
            System.out.println("|        3           |       $150.000        |");
            System.out.println("|        4           |       $270.000        |");
            System.out.println("|____________________________________________|\n");
            periodicidad = consola.nextInt();       
            
            
            // Como ejercicio se crean los objetos con los dos constructores
            // Y se realiza la asignación de valores de manera directa al crear el objeto
            // y por los métodos de acceso Getter y Setter
            // Importante tener en cuenta que para usar los métodos Getter y Setter
            // se debe primero instanciar el objeto. (Si se genera el error Java.NullPointerExceptión
            // es por que los valores son tipo null, es decir no se han inicializado).
            //
            
            // 1. Método 1: Instanciando el objeto pasando los valores de los atributos 
            //              directamente en el constructor.
            //suscriptores[i] = new Suscriptor(codigo, estado, periodicidad);
            
            
            // 1. Método 2: Instanciamos primeto el objeto y luego se pasan los valores a los atributos 
            //              por medio de los métodos Getters y Setters.
            suscriptores[i] = new Suscriptor();
            suscriptores[i].setCodigo(codigo);
            suscriptores[i].setEstado(estado);
            suscriptores[i].setPeriodicidad(periodicidad);
            
            pagoTotal += suscriptores[i].CalcularPago();
            
        }
       
        for(int i = 0; i < suscriptores.length; i++){
            System.out.println("El valor a pagar para el suscriptor del código "
                +suscriptores[i].getCodigo()+" es: "+suscriptores[i].CalcularPago());
        }
            System.out.println("El valot total por pagar es: "+pagoTotal);
        
    }
    
}
