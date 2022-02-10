package controle;

import java.util.Scanner;

/**
 * 
 * @author jesusruescasjunior
 * @since JDK1.0
 */

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		//Domingo -> 1
		//Segunda -> 2
		//Ter�a -> 3
		//Quarta -> 4
		//Quinta -> 5
		//Sexta -> 6
		//S�bado -> 6
		Scanner entrada = new Scanner(System.in);
		
		String dia;
		System.out.println("Informe um dia da semana");
		dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		} else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		} else if("ter�a".equalsIgnoreCase(dia)
				|| "terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		} else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		} else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		} else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		} else if("s�bado".equalsIgnoreCase(dia)
				|| "sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		} else {
			System.out.println("Dia inv�lido!");
		}
		entrada.close();
		
	}

}
