package Singleton;

public class GerenciadorSeguranca {
	
	private static GerenciadorSeguranca instance;
	
	public static GerenciadorSeguranca getInstance(){
		if (instance == null){
			instance = new GerenciadorSeguranca();		
		}
		return instance;
	}
	
	private GerenciadorSeguranca() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void login(){
		System.out.println("Olá...");		
	}

}
