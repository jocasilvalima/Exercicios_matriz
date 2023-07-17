package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		
		int matr [] [] = new int [3] [2];
		int soma = 0;
		for (int l = 0; l < 3; l++ ) {
			for(int c = 0; c < 2; c++) {
				
				matr [l][c] = Teclado.lerInt("informe um número");
				
				soma += matr[l][c];
				
			}//fim do for coluna
		}//fim do for linha

		System.out.println("Exibindo todos os valores da matriz");
		
		for (int l = 0; l < 3; l++ ) {
			for(int c = 0; c < 2; c++) {
				
				System.out.println(matr [l][c]);
				
				
			}//fim do for coluna
		}//fim do for linha
		System.out.println(" A soma de todos os valores da matriz é  " + soma);
	}

}
