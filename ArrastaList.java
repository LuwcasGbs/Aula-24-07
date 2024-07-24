package Semestre2;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrastaList {

	public static void main(String[] args) {
		String[] disciplinas = {"Matemática","Filosofia","História","Física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("Geografia");
		novaLista.add("Língua Portuguesa");
		novaLista.add("Biologia");
		novaLista.add("Arte");
		
		for (String i: novaLista)
		{
			System.out.println("Disciplina: "+ i);
		}
	}

}
