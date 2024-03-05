
package calcularobesidad;

import java.util.Scanner;


public class CalcularObesidad {

	
	public static void main(String[] args) {
		
		Scanner persona = new Scanner (System.in);
		
		System.out.println("Cual es tu peso en kilogramos?");
		int peso = persona.nextInt();
		
		System.out.println("Cual es tu estatura en metros?");
		double estatura = persona.nextDouble();
		
		double resultado = peso / (estatura * estatura);
		
		double IMC = resultado;
		
		if (IMC<=16) {
			System.out.println("Delgadez severa");
		}
		
		else if (IMC<=17) {
			System.out.println("Delgadez moderada");
		}
		
		else if (IMC<=18) {
			System.out.println("Delgadez leve");
		}
		
		else if (IMC<=25) {
			System.out.println("Peso normal");
		}
		
		else if (IMC<=30) {
			System.out.println("Sobrepeso");
		}
		
		else if (IMC<=35) {
			System.out.println("Obesidad leve");
		}
		
		else if (IMC<=40) {
			System.out.println("Obesidad moderada");
		}
		
		else {System.out.println("Obesidad morbida");
		
		}

	}

	
}
