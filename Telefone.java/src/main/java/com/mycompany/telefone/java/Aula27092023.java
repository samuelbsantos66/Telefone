/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telefone.java;

/**
 *
 * @author alunolab07
 */
public class Aula27092023 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        DDD d1 = new DDD("27","ES");
        DDD d2 = new DDD("11","SP");
        
        System.out.println(d1.getnumero());
        CHIP c1 = new CHIP("09","Claro");
          System.out.println(c1.getoperadora());
        
          TelefoneJava t1 = new TelefoneJava("992979778", d1,"Samuel",123789205);
          
    } 
}
