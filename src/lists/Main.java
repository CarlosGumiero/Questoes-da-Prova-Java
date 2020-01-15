package lists;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main (String[] args)
	{
		 int maiorIdade = 0, qtdLista;
		 String pessoaMaior = null;
		
		Pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		listaPessoas.add(p4);
		
		for (Pessoa pessoa : listaPessoas) 
		{
			if(maiorIdade < pessoa.idade) 
			{
				maiorIdade = pessoa.idade;
				pessoaMaior = pessoa.nome;
			}
		}
		
		System.out.println("Questão 1: ");
		System.out.println("A pessoa com a maior idade é: " + pessoaMaior + " com " + maiorIdade + " anos.");
			
		qtdLista = listaPessoas.size();
		
		System.out.println("A lista tem " + qtdLista + " pessoas.");
		System.out.println("");
		
		System.out.println("Questão 2: ");
		
		for(int i = 0; i < listaPessoas.size(); i++)
		{
			if(listaPessoas.get(i).idade < 18)
			{
				listaPessoas.remove(i);
			}
		}
		
		qtdLista = listaPessoas.size();
		System.out.println("A lista tem " + qtdLista + " pessoas.");
		System.out.println("");
		
		System.out.println("Questão 3: ");
		
		for(int i = 0; i < listaPessoas.size(); i++)
		{
			if(listaPessoas.get(i).nome == "Jessica")
			{
				System.out.println(listaPessoas.get(i).nome + " está na lista, sua idade é de " + listaPessoas.get(i).idade + " anos.");
			}
		}
	
	}
}
