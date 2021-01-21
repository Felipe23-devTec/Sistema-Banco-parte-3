package modelo.banco;

public interface ICliente {
	public void adicionarContaCliente(IConta contaCliente);
	public void adicionarTelefone(String telefone);
	public void removerTelefone(String telefone);

}
