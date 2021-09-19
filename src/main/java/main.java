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
        //Suscriptor suscriptores[];
        //suscriptores = new Suscriptor[2];
        Suscriptor suscriptor;
        List<Suscriptor> suscriptores = new ArrayList<Suscriptor>();
        
        System.out.println("------------------------------------");
        System.out.println("----  MINTIC - RETO DE REFUERZO ----");
        System.out.println("----                            ----");
        System.out.println("----  Liquidación servicio de   ----");
        System.out.println("----  suscripción a periódico   ----");
        System.out.println("----                            ----");
        System.out.println("------------------------------------");
        
        System.out.println("\nIngrese la cantidad de suscriptores: ");
        N_Suscriptores = consola.nextInt();
        
        
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
            
            suscriptor = new Suscriptor(codigo, estado, periodicidad);
            suscriptores.add(i, suscriptor);
            
            pagoTotal += suscriptores.get(i).CalcularPago();
            
        }
       
        for(int i = 0; i < suscriptores.size(); i++){
            System.out.println("El valor a pagar para el suscriptor del código "
                +suscriptores.get(i).getCodigo()+" es: "+suscriptores.get(i).CalcularPago());
        }
            System.out.println("El valot total por pagar es: "+pagoTotal);
        
    }
    
}
