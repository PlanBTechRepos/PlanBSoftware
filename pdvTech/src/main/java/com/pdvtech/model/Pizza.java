/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pdvtech.model;

import java.util.ArrayList;

/**
 *
 * @author Yago_
 */
public class Pizza {
    ArrayList <String> ingredientes = new ArrayList(); 
    private int selecaoMolho;
    private int selecaoBorda;
    private int qtdPizza;

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

  

    

    public int getSelecaoMolho() {
        return selecaoMolho;
    }

    public void setSelecaoMolho(int selecaoMolho) {
        this.selecaoMolho = selecaoMolho;
    }

    public int getSelecaoBorda() {
        return selecaoBorda;
    }

    public void setSelecaoBorda(int selecaoBorda) {
        this.selecaoBorda = selecaoBorda;
    }

    public int getQtdPizza() {
        return qtdPizza;
    }

    public void setQtdPizza(int qtdPizza) {
        this.qtdPizza = qtdPizza;
    }
    
    public void AdicionarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }
    
    public void RetirarIngrediente(String ingrediente){
      this.ingredientes.remove(ingrediente);
    }
}
