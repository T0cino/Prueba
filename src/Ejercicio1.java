package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Como vamos a cargar los numero por el teclado cargarArray(numeros); 
		//no hace falta poner int []numeros = {2,5,6,4,7,9,2,1,10,6};
		//Ponemos int []numeros = new int [10];
		//bueno bueno vamos a probar
		//klk manito
		int []numeros = new int [10];
		int []numeros2 = new int [10];
		int []numeros3 = new int [10];
		cargarArray(numeros);
		cargarArray(numeros2);
		numeros3=sumarArrays(numeros, numeros2);
		visualizarArray(numeros3);
	}
	
	static void cargarArray(int []numeros) {
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= sc.nextInt();
			
		}
			
	}
	static int[] sumarArrays(int[]numeros, int []numeros2) {
		int[] suma= new int [10];
		for (int i = 0; i <numeros.length; i++) {
			suma[i]=numeros[i]+numeros2[i];
			
		}
		return suma;
		
		
	}
	static void visualizarArray(int []array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		
	}
		
	

}
