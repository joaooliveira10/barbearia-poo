/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbearia;

/**
 *
 * @author joaooliveira
 */
public class Conta {
    private double credito;
    
    private static int total;
            
    //Cliente
    private Cliente titular;

    //Barbeiros
    private Barbeiros ativos;
    
    public Conta(){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.credito = 0;
        System.out.println("Estou criando uma conta ");
    }
    public void deposita(double valor){
        this.credito += valor;
    }
    
    public boolean saca(double valor){
        if(this.credito >= valor){
            this.credito -= valor;
            return true;
        } else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
       public boolean transfere(double valor, Conta destino){
           if(this.credito >= valor){
               this.credito -= valor;
               destino.deposita(valor);
               return true;
           }else{
               return false;
           }
       }
       
          public double getCredito(){
              return this.credito;
          }    
          public void setTitular(Cliente titular){
              this.titular = titular;
          }
           public Cliente getTitular(){
              return this.titular;
          }
           public void setAtivos(Barbeiros ativos){
              this.ativos = ativos;
          }
          public Barbeiros getAtivos(){
              return this.ativos;
          }
          public static int getTotal(){
              return Conta.total;
          }
}
