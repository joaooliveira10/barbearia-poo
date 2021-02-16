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
public class CriaConta {
    	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("Joao Oliveira");
                joao.setIdade(25);
		joao.setCpf("101.101.101-11");
		joao.setTelefone("99999-9999");

		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(100);

		contaDoJoao.setTitular(joao);
		System.out.println(contaDoJoao.getTitular().getNome());
		System.out.println(contaDoJoao.getTitular());
                
                //System.out.println("Nome: " + joao.getNome() + " Idade: " + joao.getIdade() + " CPF: " + joao.getCpf() +  " Telefone: " + joao.getTelefone() + " Credito: " + contaDoJoao.getCredito());

	}
}