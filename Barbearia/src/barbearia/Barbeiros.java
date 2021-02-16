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
public class Barbeiros {
    private String bnome;
    private int    bidade;
    private int    quantidadeAtendimento;
    
    public String getBnome(){
        return this.bnome;
    }
    public void setBnome(String bnome){
        this.bnome = bnome;
    }
    public int getBidade(){
        return this.bidade;
    }
    public void setBidade(int bidade){
        this.bidade = bidade;
    }
    public int getQuantidadeAtendimento(){
       return this.quantidadeAtendimento;
    }
    public void setQuantidadeAtendimento(int quantidadeAtendimento){
        this.quantidadeAtendimento = quantidadeAtendimento;
    }
    
}
