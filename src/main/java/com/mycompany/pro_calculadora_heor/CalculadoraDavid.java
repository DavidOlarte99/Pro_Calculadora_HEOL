/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro_calculadora_heor;

import java.util.Scanner;

/**
 *
 * @author ceti
 */
public class CalculadoraDavid {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("¿Que quieres hacer?");
        System.out.println("Pulsa 1 - Para sumar");
        System.out.println("Pulsa 2 - Para restar");
        System.out.println("Pulsa 3 - Para multiplicar");
        System.out.println("Pulsa 4 - Para dividir");
        System.out.println("Pulsa 5 - Para porcentaje");
        
        int operacion = sc.nextInt();
        
        switch(operacion){
            case 1 : sumar();
            case 2 : restar();
            case 3 : multiplicar();
            case 4 : dividir();
            case 5 : porcentaje();
        }
        
    }
    
    
}
