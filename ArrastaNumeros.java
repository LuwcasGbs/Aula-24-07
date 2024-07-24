package Semestre2;

import java.util.ArrayList;

public class ArrastaNumeros {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		
		System.out.println("Adicionando valor: "+numeros.get(0));
		System.out.println("Adicionando valor: "+numeros.get(1));
		
		numeros.set(1, 25);
		System.out.println("Mudando valor: "+numeros.get(1));
		
		numeros.remove(0);
		System.out.println("Removendo valor.. Valor restante: "+numeros.get(0));
		
		System.out.println("Tamanho da lista: "+numeros.size());
	}

}
