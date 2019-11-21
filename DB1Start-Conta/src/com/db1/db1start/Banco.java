package com.db1.db1start;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        boolean continuar=true;
        String execucao,nome;
        int nconta,numero,escolha;
        Conta c=null;
        double saldoinicial,valor;
       
        while(continuar==true){
            System.out.println("Digite 1 para criar conta, "
                    + "2 para sacar, 3 para depositar e 4 para ver"
                    + " o saldo: ");
            escolha = in.nextInt();
            if(escolha==1){
                System.out.println("Digite o número da sua conta: ");
                numero = in.nextInt();
                System.out.println("Digite o nome do titular: ");
                nome = in.next();
                System.out.println("Digite o depósito inicial: ");
                saldoinicial = in.nextDouble();
                c = new Conta(numero,nome,saldoinicial);
                System.out.println("Saldo atual: "+c.getSaldo());
            }
            if(escolha==2){
                System.out.println("Digite o valor que deseja sacar: ");
                valor = in.nextDouble();
                boolean saque_efetuado = c.sacar(valor);
                if (saque_efetuado==true){
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Saldo atual: "+c.getSaldo());
                }else{
                    System.out.println("Valor inválido!");
                }
            }
            if(escolha==3){
                System.out.println("Digite o valor que deseja depositar: ");
                valor = in.nextDouble();
                boolean deposito_efetuado = c.setSaldo(valor);
                if(deposito_efetuado==true){
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Saldo atual: "+c.getSaldo());}
               else{
                System.out.println("Valor inválido.");
                }
            }
            if(escolha==4){
                System.out.println("Saldo atual: "+c.getSaldo());
            }
            System.out.println("Deseja continuar? s - sim/ n - não");
            execucao = in.next();
            if(execucao.equals("n")){
                continuar=false;
            }
        }  
    }
}