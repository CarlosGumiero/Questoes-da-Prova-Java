package questao04;

public class Main 
{
	public static void main (String[] args)
	{
		Gerente g1 = new Gerente ("Robson", 33, 10000);
		Supervisor s1 = new Supervisor ("Estef�no", 26, 8000);
		Vendedor v1 = new Vendedor ("Robscl�ison", 51, 5000);
		
		System.out.println("O gerente " + g1.getNome() + " tem " + g1.getIdade() + " anos e ganha R$" + g1.bonificacao() + " de sal�rio com a bonifica��o.");
		System.out.println("O supervisor " + s1.getNome() + " tem " + s1.getIdade() + " anos e ganha R$" + s1.bonificacao() + " de sal�rio com a bonifica��o.");
		System.out.println("O vendedor " + v1.getNome() + " tem " + v1.getIdade() + " anos e ganha R$" + v1.bonificacao() + " de sal�rio com a bonifica��o.");
	}
}
