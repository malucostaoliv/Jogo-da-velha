/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Jogador {
    private String nome;
    private int numero;
    private char simbolo;
    
     public int getNumero(){
    return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getNome(){
    return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public char getSimbolo(){
    return simbolo;
    }
    
    public void setSimbolo(char simbolo){
        this.simbolo = simbolo;
    }
    
    public Jogador(int numero, String nome, char simbolo){
        this.numero = numero;
        this.nome = nome;
        this.simbolo = simbolo;
    }
    
    public void jogar(){
        
    }
}
