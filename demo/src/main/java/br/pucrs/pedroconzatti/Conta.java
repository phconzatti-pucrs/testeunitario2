package br.pucrs.pedroconzatti;

public class Conta {
    private double saldo;
    public Conta(double saldo) {
    this.saldo = saldo;
    }
    public double getSaldo() {
    return this.saldo;
    }
    public void setSaldo(double saldo) {
    this.saldo = saldo;
    }
    public void depositar(double valor) {
    saldo = saldo + valor;
    }
    public void sacar(double valor) {
    saldo = saldo - valor;
    }
    }
