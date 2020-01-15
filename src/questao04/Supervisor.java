package questao04;

public class Supervisor extends Funcionario
{

	public Supervisor(String nome, int idade, float salario) 
	{
		super(nome, idade, salario);
	}
	
	public float bonificacao()
	{
		return getSalario() + 5000;
	}

}
