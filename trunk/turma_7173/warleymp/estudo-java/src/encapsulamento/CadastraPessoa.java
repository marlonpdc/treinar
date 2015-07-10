package encapsulamento;

public class CadastraPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("warley");
		pessoa.setEndereco("rua a, 525");
		pessoa.setBairro("centro");
		pessoa.setCidade("Belo Horizonte");
		pessoa.setEstado("MG");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getEstado());
	}
}
