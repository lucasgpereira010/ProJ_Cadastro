package view;

import model.Pessoa;

public class Execusão {

		public static void main(String[] args) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Lucas Garcia Pereira");
			
			System.out.println(pessoa.getNome());
			
			pessoa.setendereco("Rua 15");
			
			System.out.println(pessoa.getendereco());
			
			pessoa.setbairro("Bairro 13");
			
			System.out.println(pessoa.getbairro());
			
			pessoa.setcep(828407055);
			
			System.out.println(pessoa.getcep());
			
			pessoa.setcidade("São Paulo");
			
			System.out.println(pessoa.getcidade());
			
			pessoa.setestado("São Paulo");
			
			System.out.println(pessoa.getestado());
		}
}
