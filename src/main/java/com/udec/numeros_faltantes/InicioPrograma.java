/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.numeros_faltantes;

/**
 *
 * @author julian esteban vallejo galindo
 * 
 */
public class InicioPrograma {
    
    public static void Numeros(){
        PedirNumeros pedir = new PedirNumeros();//creo un nuevo apuntador en memoria
        pedir.solicitarNumeros();//utilizo el metodo solicitarNumeros
    }
    
    public static void main(String[] args){ 
        Numeros();//llamo al metodo Numeros
    }
}
