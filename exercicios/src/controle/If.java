package controle;
import java.util.Scanner;

/**
 * 
 * @author jesusruescasjunior
 * @since JDK1.0
 */

public class If {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média");
		double media = entrada.nextDouble();
		
		boolean Aprovado =  media <= 10.0 && media >= 7.0;
		boolean Exame =  media < 7 && media >= 4.5;
		boolean Reprovado =  media < 4.5 && media >= 0;
		
		if(media <= 10.0 && media >= 7.0) {
			System.out.println("Aprovado!");
		}
		if(media < 7 && media >= 4.5) {
			System.out.println("Exame!");
		}
		if(media < 4.5 && media >= 0) {
			System.out.println("Reprovado!");
		}
		
		if(Aprovado) {
			System.out.println("Aprovado!");
		}
		if(Exame) {
			System.out.println("Exame!");
		}
		if(Reprovado) {
			System.out.println("Reprovado!");
		}
		
		
		entrada.close();
	}

}
