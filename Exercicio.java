package Semestre2;

import java.util.ArrayList;

import java.util.Random;

public class Exercicio {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			int numeroAleatorio = random.nextInt(10);
			numeros.add(numeroAleatorio);
			
		}
		System.out.println("Lista completa :D");
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		numeros.remove(4);
		
		System.out.println("Lista Incompleta.. (Elemento na quarta posição removido)");
		for(int numero : numeros) {
			System.out.println(numero);
	}

}
}
