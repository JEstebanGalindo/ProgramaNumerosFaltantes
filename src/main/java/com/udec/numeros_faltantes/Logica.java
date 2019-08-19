/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.numeros_faltantes;


/**
 *
 * @author julian esteban vallejo galindo
 */
public class Logica {
    /**
     * @param vectorGuardado es el vectorDigitado  por consola
     * descricion del metodo: el metodo calcularExtremos calcula los extremos osea el numero mayor y el numeromenor y la cantidad de posiciones que deberia tener el vector si estuviera completo 
     */    
    public void calcularExtremos(Integer... vectorGuardado){  
        int numeroMayor = vectorGuardado[0];//variable para guardar el numero mayor
        int numeroMenor;//variable para guardar numero menor
        int cantidadPosiciones;//variable para guardar la candidad de posiciones del vector si estuviera lleno
        //este for clacula el numero mayor del vector digitado
        for (int i = 0; i < vectorGuardado.length; i++) {	 		
            if (vectorGuardado[i] > numeroMayor) {//pregunto si el numero del vector en la posicoin i es mayor a nuemroMayor
                    numeroMayor = vectorGuardado[i];//asigno el numero a numeroMayor
            }
        }
        numeroMenor = numeroMayor;//igualo el menor al mayor
        //este for calcula el numero menor de la lista digitada
        for (int i = 0; i < vectorGuardado.length; i++) {
            if (numeroMenor > vectorGuardado[i]){//pregunto si el numero menor es mayor al de la posicion del vector
                    numeroMenor = vectorGuardado[i];//le asigno el menor a la variable numeroMenor
            }
        }
        cantidadPosiciones = numeroMayor - numeroMenor;//calculo la cantidad de posiciones que debe tener el vector si estuviera completo
        calcularFaltantes(cantidadPosiciones, numeroMayor, numeroMenor, vectorGuardado);//le envio al metodo calcularFaltantes la cant posiciones numero mayor y menor y el vector
    }
    
    /**
     * 
     * @param cantidadPosiciones cantidad que deberia tener el vector totalmente lleno (numeromayor - numero menor)
     * @param numeroMayor numero mayor del vector
     * @param numeroMenor numero menor del vector
     * @param vector vector digitado por consola
     * Este metodo calcula numeros faltantes
     */  
    public void calcularFaltantes(int cantidadPosiciones, int numeroMayor, int numeroMenor, Integer[] vector){
        int vectorFaltantes[] = new int[cantidadPosiciones];//creo vector de los numeros faltantes y le asigno un tamaño    
        for(int i=0; i<cantidadPosiciones; i++){//este for sirve para saber que numero hace falta
            boolean bandera = true;//bandera para saber cuando encontro el numero
            for(int j=0; j<vector.length; j++){//este for anidado revisa todas las posiciones del vetor
                if(vector[j]==(numeroMenor)){//este if sirva para saber si encontro un numero igual en el vector (osea ya esta)
                    numeroMenor = numeroMenor + 1;//le sumo 1 al numeroMenor para buscar el siguiente numero
                    bandera = false;//bandera en false para que no entre al siguiente if
                    break;//sale del ciclo
                }
            }
            if(bandera == true){//indica que el numero no esta 
                vectorFaltantes[i] = (numeroMenor); //se agrega el numero al vector faltante        
                numeroMenor = numeroMenor + 1;//le sumo 1 al numero para buscar el siguiente
            }
        }
        imprimir(vectorFaltantes);//le envio al metodo imprimir el vector y el vectorFaltante
    }   
    
    /**
     * @param vectorFaltantes //es el vector de los numeros que faltan
     * Este metodo imprime el vector
     */ 
    public void imprimir(int[] vectorFaltantes) {
        for(int i=0; i<vectorFaltantes.length; i++) {
            if(vectorFaltantes[i] != 0){//valido que no me imprima los 0 o "vacios" del vector de numeros faltantes
                System.out.println("Los numeros faltantes son: " + vectorFaltantes[i]);//imprime el vector de los nuemros faltantes
            }
        }
    }
}   

