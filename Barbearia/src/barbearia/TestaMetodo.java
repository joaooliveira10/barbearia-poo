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
public class TestaMetodo {
    
    public static void main(String[] args){
        Conta contaTeste = new Conta ();
        //contaTeste.getCredito() = 100.50;
        contaTeste.deposita(150.50);
        System.out.println(contaTeste.getCredito());
        
        boolean conseguiuRetirar = contaTeste.saca(150);
        System.out.println("Seu saldo atual é de: " + contaTeste.getCredito());
        System.out.println(conseguiuRetirar);
        
        Conta contaTeste2 = new Conta();
        contaTeste2.deposita(1000);
        boolean sucessoTransferencia = contaTeste2.transfere(1000, contaTeste);
        
        if (sucessoTransferencia){
            System.out.println("Credito adicionado!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
            System.out.println(contaTeste2.getCredito());
            System.out.println(contaTeste.getCredito());
        }
}
