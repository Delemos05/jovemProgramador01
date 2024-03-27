package aula02;
import java.util.ArrayList;
import java.util.Scanner;

public class aula02 {
	public static void main(String[] args) {
																										
		System.out.println("Hellow World");
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());
		
		System.out.println("Digite o teu nome: ");
		
		Scanner Entrada = new Scanner(System.in);
		String nome = Entrada.next();
		
		//list.add(nome);
		
		System.out.println(nome);
		
	}

}
