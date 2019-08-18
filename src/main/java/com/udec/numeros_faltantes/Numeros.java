/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.numeros_faltantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author julian esteban vallejo galindo
 */
public class Numeros {
    public static void main(String[] args){ 
        guardarNumeros();
    }
        
    //Este metodo se encarga de pedir datos en consola
    static void guardarNumeros(int ...a){ 
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true; 
        int numero;    
        List<Integer> listaNumeros = new ArrayList<>();    
        //Este if pregunta por primera vez ingrese un numero                
        while (seguir == true) { 
            if(listaNumeros.isEmpty()){
                System.out.print("Introduce un numero: ");                 
                    numero = entrada.nextInt();
                    listaNumeros.add(numero);
            }else{ 
                System.out.print("¿Desea continuar? "); 
                System.out.println("S / N ");
                String opc = entrada.next();        
                //este if es para preguntar si desea seguir ingresando numeros 
                if (opc.equals("s") || opc.equals("S")) { 
                    System.out.print("Introduce un numero: ");                 
                    numero = entrada.nextInt();
                    listaNumeros.add(numero);                
                }else{
                    seguir=false;
                }            
            }
        }
        calcularExtremos(listaNumeros);
    }    
    //este metodo calcula los extremos osea el mayor y el menor y la cantidad de posiciones que debe tener 
    public static void calcularExtremos(List<Integer> listaGuardada){  
        //poner para que sirven estas variables
        int numeroMayor = listaGuardada.get(0);
        int numeroMenor;
        int cantidadPosiciones;
        //este for clacula el numero mayor de la lista digitada
        for (int i = 0; i < listaGuardada.size(); i++) {	 		
            if (listaGuardada.get(i) > numeroMayor) {
                    numeroMayor = listaGuardada.get(i);
            }
        }
        numeroMenor = numeroMayor;
        //este for calcula el numero menor de la lista digitada
        for (int i = 0; i < listaGuardada.size(); i++) {
            if (numeroMenor > listaGuardada.get(i)){
                    numeroMenor = listaGuardada.get(i);
            }
        }
        cantidadPosiciones = numeroMayor - numeroMenor;
        calcularFaltantes(cantidadPosiciones, numeroMayor, numeroMenor, listaGuardada);  
    }
    //Este metodo calcula numeros faltantes
    public static void calcularFaltantes(int cantidadPosiciones, int numeroMayor, int numeroMenor, List<Integer> lista){        
        
        List<Integer> listaFaltantes = new ArrayList<>();
        
        for(int i=0; i<cantidadPosiciones; i++){
            if(lista.contains(numeroMenor)){
                numeroMenor = numeroMenor + 1;
            }else{
               listaFaltantes.add(numeroMenor);                
               numeroMenor = numeroMenor + 1;
            }        
        }
        System.out.println("Los numeros faltantes son:" + listaFaltantes + "\n"+ "Los numeros ingresados son:" + lista);
    }    
}



