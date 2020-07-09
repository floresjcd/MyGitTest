package Singleton;

public class Main {
	public static void main(String[] args){
		GerenciadorSeguranca gs1 = GerenciadorSeguranca.getInstance();
		GerenciadorSeguranca gs2 = GerenciadorSeguranca.getInstance();
		
		gs1.login();
		gs2.login();
		
		//Foram instanciados os dois objetos gs1 e gs2, porém o objeto da classe 
		// GerenciadorSeguranca é o mesmo, ou seja, permite uma única instancia
		
		//comparandos os objetos
		if (gs1.equals(gs2)) {
			System.out.println("os dois objetos são iguais");
		} else {
			System.out.println("os dois objetos são iguais são diferente");
		}		
		
	}


}
