package curso_exemplos.pilaresPOO.apps;

public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	@Override
	public void salvarHistorico() {
		// TODO Auto-generated method stub
		
	}
}
