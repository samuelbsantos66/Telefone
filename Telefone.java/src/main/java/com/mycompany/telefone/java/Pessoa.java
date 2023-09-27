/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telefone.java;

/**
 *
 * @author alunolab07
 */
public class Pessoa {
    private String nome;
    private int rg;
    private TelefoneJava t;
    
    public Pessoa(){

    }
    
    public void setTelefoneJava(TelefoneJava t){
    this.t = t;
    }    
    
    public TelefoneJava getTelefoneJava(){
        return this.t;
    }
    public String getnome(){
    return nome;
}
    public int getrg(){
    return rg;
    }
    
}
