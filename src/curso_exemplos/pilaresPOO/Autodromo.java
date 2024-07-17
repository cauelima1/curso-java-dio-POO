package curso_exemplos.pilaresPOO;

public class Autodromo {
	public static void main(String[] args) {
		Carro polo = new Carro();
		Moto z400 = new Moto();
		
		polo.setChassi("12345678");
		z400.setChassi("87654321");
		
		polo.ligar();
		System.out.println ("Chassi do carro: " + polo.getChassi());
		
		z400.ligar();
		System.out.println ("Chassi da moto: " + z400.getChassi());
		
	}

}
