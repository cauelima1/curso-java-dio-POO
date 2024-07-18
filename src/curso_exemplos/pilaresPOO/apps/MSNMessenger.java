package curso_exemplos.pilaresPOO.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
	@Override
	public void salvarHistorico() {
		// TODO Auto-generated method stub
		
	}
	
	
}
