package Calculadora_Package;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora_App{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Double valorUm, valorDois;
		String operacao;
		
		do {
			
			try {
			
			System.out.println("Digite um valor: ");
			valorUm = scanner.nextDouble();
			
			System.out.println("Digite a operacao: +, -, /, *");
			operacao = scanner.next();
					
			System.out.println("Digite um valor: ");
			valorDois = scanner.nextDouble();	
			
			System.out.println("Resultado = " + realizarCalculo(valorUm, valorDois, operacao));
		
				}catch (InputMismatchException ex) {
					System.out.println("Valores não aceitos.");
					 scanner.next();							
					}	
			
		} while(true);
	}
	
	public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
		
		Double resultado = 0.0;
		
		switch (operacao) {
        case "+":
            resultado = valorUm + valorDois;
            break;
            
        case "-":
        	resultado = valorUm - valorDois;
            break;
            
        case "*":
        	resultado = valorUm * valorDois;
            break;
            
		case "/":
        	resultado = valorUm / valorDois;
        	break;
        	
		default:
			System.out.println("Operação é invalido");
			break;		
		}
		return resultado;
	}
}