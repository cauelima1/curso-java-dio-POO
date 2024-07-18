package curso_exemplos.conceito_de_interface.multifuncional;

import curso_exemplos.conceito_de_interface.copiadora.Copiadora;
import curso_exemplos.conceito_de_interface.digitalizadora.Digitalizadora;
import curso_exemplos.conceito_de_interface.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	public void copiar() {
		System.out.println("COPIANDO VIA MULTIFUNCIONAL");
		
	}


	public void digitalizar() {
		System.out.println("DIGITALZIANDO VIA MULTIFUNCIONAL");
		
	}


	public void imprimir() {
		System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
		
	}

}
