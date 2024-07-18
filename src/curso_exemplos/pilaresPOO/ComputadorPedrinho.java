package curso_exemplos.pilaresPOO;

import java.util.Scanner;

import curso_exemplos.pilaresPOO.apps.FacebookMessenger;
import curso_exemplos.pilaresPOO.apps.MSNMessenger;
import curso_exemplos.pilaresPOO.apps.ServicoMensagemInstantanea;
import curso_exemplos.pilaresPOO.apps.Telegram;

public class ComputadorPedrinho {
	
	/*
	 * Simulação do uso da classe MSNMessenger
	 */
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			//criando uma classe que sera escolhida entre os 3 apps (polimorfismo)
			ServicoMensagemInstantanea smi = null;
			
			System.out.println("msn , fcb ou tlg ?");
			
			String appEscolhido = scan.next();
			
			if (appEscolhido.equals("msn"))
				smi = new MSNMessenger();
			if (appEscolhido.equals("fcb"))
				smi = new FacebookMessenger();
			if (appEscolhido.equals("tlg"))
				smi = new Telegram();
			
			smi.enviarMensagem();
			smi.receberMensagem();
			
			
		}
		
			
			
		
	
}
