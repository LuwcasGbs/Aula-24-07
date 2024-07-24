package Semestre2;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrasystado {

	public static void main(String[] args) {
		Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> novaLista = new ArrayList<Integer>(Arrays.asList(numeros));
	
		for (int numero : numeros) {
		System.out.println(numero*2+" ");
		}
	}
}
