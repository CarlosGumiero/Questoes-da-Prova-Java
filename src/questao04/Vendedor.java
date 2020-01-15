package questao04;

public class Vendedor extends Funcionario
{

	public Vendedor(String nome, int idade, float salario) 
	{
		super(nome, idade, salario);
	}
	
	public float bonificacao()
	{
		return getSalario() + 3000;
	}

}
