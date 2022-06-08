import java.util.Scanner;

public class JogoAdivinhacao {
	
	private int Max;
	private int Min;
	private int Numero;
	private boolean Status = false;
	private int Tentativa = 0;

	public void setNumero(int numero) {
		this.Numero = numero;
	}
	
	public int getNumero() {
		
		return this.Numero;
	}
	
	public void Iniciar() {
		
		while(this.Status != true) {
			
			Scanner Num = new Scanner(System.in);
			System.out.println("Insira um número: ");
			int numjogador = Num.nextInt();
			
			if(numjogador > this.Numero) {
				this.Max = numjogador;
			}else if(numjogador < this.Numero){
				this.Min = numjogador;
			}
			
			if(this.Numero == numjogador) {
				
				this.Tentativa = this.Tentativa + 1;
				System.out.println("PARABÉNS, VOCÊ ACERTOU O NÚMERO!!!");
				System.out.println("Número de tentativas: " + this.Tentativa);
				this.Status = true;
				
			}else {
				
				this.Tentativa = this.Tentativa + 1;
				System.out.println("VOCÊ NÃO ACERTOU O NÚMERO. TENTE NOVAMENTE.");
				System.out.println("O valor está entre " + this.Min + " e " + this.Max);
			}
		}
	}
	
	
}
