/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Tabuleiro {
    private int notaJ1;
    private int notaJ2;
    private String regras;
    private boolean houveGanhadorUltimaRodada;
    private int jogadorDaVez;
    private char a1 = ' ', b1 = ' ', c1 = ' ', a2 = ' ', b2 = ' ', c2 = ' ', a3 = ' ', b3 = ' ', c3 = ' ';
    private int linha;
    private int coluna;
    
    public int getJogadorDaVez(){
    return jogadorDaVez;
    }
    
    public void setJogadorDaVez(int jogadorDaVez){
        this.jogadorDaVez = jogadorDaVez;
    }
    
    public boolean isHouveGanhadorUltimaRodada(){
    return houveGanhadorUltimaRodada;
    }
    
    public void setHouveGanhadorUltimaRodada(boolean houveGanhadorUltimaRodada){
        this.houveGanhadorUltimaRodada = houveGanhadorUltimaRodada;
    }
    
    public int getNotaJ1(){
    return notaJ1;
    }
    
    public void setNotaJ1(int notaJ1){
        this.notaJ1 = notaJ1;
    }
    public int getNotaJ2(){
    return notaJ2;
    }
    
    public void setNotaJ2(int notaJ2){
        this.notaJ2 = notaJ2;
    }
    public String getRegras(){
    return regras;
    }
    
    public void setRegras(String regras){
        this.regras = regras;
    }
    
    public Tabuleiro(String regras){
        this.regras = regras;
        this.notaJ1 = 0;
        this.notaJ2 = 0;
        this.houveGanhadorUltimaRodada = false;
        this.jogadorDaVez = 1;
        this.linha = 0;
        this.coluna = 1;
    }
    
    public void verificarGanhador(char simbolo){
        if(a3 == simbolo && b2 == simbolo && c1 == simbolo){
            this.houveGanhadorUltimaRodada = true;
        }else if(a1 == simbolo && b2 == simbolo && c3 == simbolo){
            this.houveGanhadorUltimaRodada = true;
        }else if(a3 == simbolo && b3 == simbolo && c3 == simbolo){
            this.houveGanhadorUltimaRodada = true;
        }else if(a2 == simbolo && b2 == simbolo && c2 == simbolo){
            this.houveGanhadorUltimaRodada = true;
        }else if(a1 == simbolo && b1 == simbolo && c1 == simbolo){
            this.houveGanhadorUltimaRodada = true;
        }else if(a1 == simbolo && a2 == simbolo && a3 == simbolo){
            this.houveGanhadorUltimaRodada = true;
        }else if(b1 == simbolo && b2 == simbolo && b3 == simbolo){
            this.houveGanhadorUltimaRodada = true;
        }else if(c1 == simbolo && c2 == simbolo && c3 == simbolo){
         this.houveGanhadorUltimaRodada = true;}
        
        
        
        
        
    }
    
    public void organizar(){
       
        
    }
    
    public void mostrarTabuleiro(){
        System.out.printf("""
                           
                                A      B      C
                             
                                   |       |       
                          1     %C |   %C  |   %C    
                                   |       |       
                            -------+-------+-------
                           
                                   |       |       
                          2    %C  |   %C  |  %C    
                                   |       |       
                            -------+-------+-------
                           
                                   |       |       
                          3    %C  |   %C  |   %C  
                                   |       |       
                           """,a1,b1,c1,a2,b2,c2,a3,b3,c3);
    }
    
    public boolean marcarJogada(char simbolo, String coordenada){
        switch(coordenada){
           case "A1" -> {
           if (this.a1 == ' ') {
           this.a1 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "B1" -> {
           if (this.b1 == ' ') {
           this.b1 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "C1" -> {
           if (this.c1 == ' ') {
           this.c1 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "A2" -> {
           if (this.a2 == ' ') {
           this.a2 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "B2" -> {
           if (this.b2 == ' ') {
           this.b2 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "C2" -> {
           if (this.c2 == ' ') {
           this.c2 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "A3" -> {
           if (this.a3 == ' ') {
           this.a3 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "B3" -> {
           if (this.b3 == ' ') {
           this.b3 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "C3" -> {
           if (this.c3 == ' ') {
           this.c3 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           
           case "a1" -> {
           if (this.a1 == ' ') {
           this.a1 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "b1" -> {
           if (this.b1 == ' ') {
           this.b1 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "c1" -> {
           if (this.c1 == ' ') {
           this.c1 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "a2" -> {
           if (this.a2 == ' ') {
           this.a2 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "b2" -> {
           if (this.b2 == ' ') {
           this.b2 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "c2" -> {
           if (this.c2 == ' ') {
           this.c2 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "a3" -> {
           if (this.a3 == ' ') {
           this.a3 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "b3" -> {
           if (this.b3 == ' ') {
           this.b3 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}
           case "c3" -> {
           if (this.c3 == ' ') {
           this.c3 = simbolo;
           return true;
           } else {
           System.out.println("Essa posição já está ocupada!");
           return false;}}

        }
    }
    
}
