import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		String usuario[][] = new String[3][2];

		// idade[0][0] = "João Maria";
		// idade[0][1] = "21";
		// idade[1][0] = "Roberto Silva";
		// idade[1][1] = "18";
		// idade[2][0] = "Adriano Souza";
		// idade[2][1] = "27";

		for (int i = 0; i < usuario.length; i++) {
			for (int j = 0; j < usuario.length; j++) {
				System.out.println("Digite o nome do usuário: ");
				usuario[i][0] = leitura.nextLine();
				System.out.println("Digite a idade do usuário: ");
				usuario[0][j] = leitura.nextLine();
			}
		}
	

		leitura.close();
	}
}
