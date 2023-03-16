/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pdvtech.model;

import java.time.LocalDate;

/**
 *
 * @author Yago_
 */
public class Pedido {
    private int numeroPedido;
    private String nomeCliente;
    private LocalDate horarioPedido;
    private float valorTotal;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getHorarioPedido() {
        return horarioPedido;
    }

    public void setHorarioPedido(LocalDate horarioPedido) {
        this.horarioPedido = horarioPedido;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
}
