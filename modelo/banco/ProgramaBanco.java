package modelo.banco;

import banco_superior_persistencia.PersistenciaEmArquivoCliente;

public class ProgramaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PersistenciaEmArquivoCliente pac = new PersistenciaEmArquivoCliente();
        
        ICliente pj1 = pac.localizarClientePorCNPJ("111");
        ICliente pj2 = pac.localizarClientePorCPF("123");
        System.out.println(pj1);
        System.out.println(pj2);
        //Cadastro de um cliente CNPJ
        //ICliente pj1 = new ClientePessoaJuridica("111","Ble","EmA","@fmail");
		//IConta conta5 = new ContaCorrente("1A","BB","12-07-2020");
		
		//pj1.adicionarContaCliente(conta5);
		
		//pj1.adicionarTelefone("81-98965-9876");
		//System.out.println(pj1);
		
		//pac.cadastrarCliente(pj1);
		

		

	}		
		 
}