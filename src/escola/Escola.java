package escola;

public class Escola {
	public static void main(String[] args) {
		
			Aluno felipe = new Aluno();
			felipe.setNome("Jose Felipe");
			felipe.setIdade(2);
			
			System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	
		}
}
