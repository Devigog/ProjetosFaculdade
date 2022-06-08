import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random valor = new Random();
		JogoAdivinhacao jogo1 = new JogoAdivinhacao();
		
		jogo1.setNumero(valor.nextInt(101));
		
		jogo1.Iniciar();
		
	}

}
