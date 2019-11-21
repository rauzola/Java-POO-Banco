package com.db1.db1start;

public class Conta {
    int numero;
    String titular;
    double saldo;
   
    public Conta(int numero,String nome,double saldo){
        this.numero=numero;
        this.titular=titular;
        this.saldo=saldo;
    }
    boolean sacar(double valor){
        if(valor>0){
            this.saldo-=valor;
            return true;
        }else{
            return false;
        }
    }
    double getSaldo(){
        return saldo;
    }
    boolean setSaldo(double valor){
        if(valor>0){
            this.saldo+=valor;
            return true;
        }else{
            return false;
        }
    }
    int getNumero(){
        return numero;
    }
   
}
