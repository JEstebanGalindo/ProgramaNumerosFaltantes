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
 * Este metodo se encarga de pedir datos en consola 
 * @author julian esteban vallejo galindo
 *
 */
public class PedirNumeros {
    //Declaracion de variables
    private final Scanner entrada = new Scanner(System.in);//se necesita importar libreria java.util.Scaner 
    private int numero;//sirve para guardar numero digitado
    List<Integer> listaNumeros = new ArrayList<>();//lista para guardar datos
       
    public void solicitarNumeros(){
        boolean seguir = true;// indica si seguir preguntando                        
        //Este while  pregunta por primera vez ingrese un numero
        while (seguir == true) {
            if(listaNumeros.isEmpty()){//este if pregunta si la lista esta vacia
                System.out.print("Introduce un numero: "); //pinta en consola introduce un numero               
                    numero = entrada.nextInt();
                    listaNumeros.add(numero);//se agrega el numero a la lista
            }else{
                System.out.print("¿Desea continuar? "); //se pinta si desea continuar
                System.out.println("S / N ");//Este metodo salta linea
                String opcion = entrada.next(); //variable opcion sirve para guardar s S u otro caracter     
                //este if es para preguntar si desea seguir ingresando numeros 
                if (opcion.equals("s") || opcion.equals("S")) {//si es igual a s o S entra a este if
                    System.out.print("Introduce un numero: "); //se pinta en consola introduce un numero            
                    numero = entrada.nextInt();//se le asigna el valor a numero
                    listaNumeros.add(numero); //se agrega el numero a la lista               
                }else{
                    seguir=false;
                }            
            }
        }
        //Ahora convierto la lista en un vector para cumplir con los requerimientos de la clase(utilizar arrays)        
        Integer[] vectorNumeros = new Integer[listaNumeros.size()];//se le asigna el tamaño al vector
        listaNumeros.toArray(vectorNumeros);//to array convierte la lista en vector
        
        Logica calcularNumeros = new Logica();//creo un nuevo apuntador en memoria
        calcularNumeros.calcularExtremos(vectorNumeros);//Envio al metodo calcularExtremos el vector de numeros digitados
    }
}
