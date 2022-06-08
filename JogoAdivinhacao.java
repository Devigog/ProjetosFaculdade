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
			System.out.println("Insira um n�mero: ");
			int numjogador = Num.nextInt();
			
			if(numjogador > this.Numero) {
				this.Max = numjogador;
			}else if(numjogador < this.Numero){
				this.Min = numjogador;
			}
			
			if(this.Numero == numjogador) {
				
				this.Tentativa = this.Tentativa + 1;
				System.out.println("PARAB�NS, VOC� ACERTOU O N�MERO!!!");
				System.out.println("N�mero de tentativas: " + this.Tentativa);
				this.Status = true;
				
			}else {
				
				this.Tentativa = this.Tentativa + 1;
				System.out.println("VOC� N�O ACERTOU O N�MERO. TENTE NOVAMENTE.");
				System.out.println("O valor est� entre " + this.Min + " e " + this.Max);
			}
		}
	}
	
	
}
