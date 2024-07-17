package curso_exemplos.pilaresPOO;

public class Carro extends Veiculo {

	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println ("Carro ligado.");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo cambio.....ok");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel.....ok");
	}

}
