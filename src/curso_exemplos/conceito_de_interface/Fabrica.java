package curso_exemplos.conceito_de_interface;

import curso_exemplos.conceito_de_interface.copiadora.Copiadora;
import curso_exemplos.conceito_de_interface.digitalizadora.Digitalizadora;
import curso_exemplos.conceito_de_interface.digitalizadora.Scanner;
import curso_exemplos.conceito_de_interface.impressora.Deskjet;
import curso_exemplos.conceito_de_interface.impressora.Impressora;
import curso_exemplos.conceito_de_interface.impressora.Laserjet;
import curso_exemplos.conceito_de_interface.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		
			EquipamentoMultifuncional em = new EquipamentoMultifuncional();
			
			Deskjet deskjet = new Deskjet();
			
			Scanner scanner = new Scanner();
			
			Impressora impressora = deskjet;
			Digitalizadora digitalizadora = scanner;
			Copiadora copiadora = em;
			
			impressora.imprimir();
			digitalizadora.digitalizar();
			copiadora.copiar();
			
			
	}
}
