import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Projecto Calculadora");

		System.out.println("Insira o primeiro numero :");
		int a = sc.nextInt();

		System.out.println("Insira o segundo numero :");
		int b = sc.nextInt();
		System.out.println("Valor a : " + a + " Valor b : " + b);
		
		System.out.println("**Escolha o tipo de operação : **");
		System.out.println("1 - Adiçao");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		int op=0;;
		switch (op) {
		case 1:
			System.out.println(ClasseSoma.soma(a, b));
	       break;
       
        
                
        default: break;
    }
		
		do {
            op = sc.nextInt();
            switch (op) {
            case 1:
    			System.out.println(ClasseSoma.soma(a, b));
    	       break;
        
            } 
        } while (op<4); // end of loop
		
		
	}
}
