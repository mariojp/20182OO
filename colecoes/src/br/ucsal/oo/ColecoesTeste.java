package br.ucsal.oo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ColecoesTeste {
	
	//Tipo atributo
	
	public static void main(String[] args) {
		
		Pessoa n1 = new Pessoa("1111111111","Pedro");
		Pessoa n2 = new Pessoa("5555555555","Joao");
		Pessoa n3 = new Pessoa("2222222222","Maria");
		Pessoa n4 = new Pessoa("4444444444","Livia");
		Pessoa n5 = new Pessoa("3333333333","Jose");
		Pessoa n6 = new Pessoa("4444444445","Livia");;
		
		
	
		System.out.println("----------------------------------");
		Set<Pessoa> lista = new TreeSet<>();
		lista.add(n1);
		lista.add(n2);
		lista.add(n3);
		lista.add(n4);
		lista.add(n5);
		lista.add(n6);

		System.out.println("----------------------------------");

		for (Pessoa nome : lista) {
			System.out.println(nome);
		}
		System.out.println("----------------------------------");
		
		Pessoa p = new Pessoa("1222222222","Maria");
		
		System.out.println("Existe: "+lista.contains(p));
		
		lista.remove(p);
		
		System.out.println("Existe: "+lista.contains(p));
		
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.toString());
		}
	}

}


