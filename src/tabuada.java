import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i, n;

        // Solicita ao usuário o número para a tabuada
        System.out.printf("Informe o número para a tabuada:\n");
        n = ler.nextInt();

        // Abre o arquivo "tabuada.txt" para escrita
        FileWriter arq = new FileWriter("g:\\tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        // Gera e escreve a tabuada no txt
        gravarArq.printf("┎--Resultado--┒%n");
        for (i=1; i<=10; i++) {
            gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
        }

        // Escreve o rodapé da tabuada no txt
        gravarArq.printf("┖-------------┚%n");

        // Fecha o arquivo
        arq.close();

        // Informa ao usuário que a tabuada foi gravada com sucesso
        System.out.printf("\nTabuada do %d foi gravada com sucesso em \"g:\\tabuada.txt\".\n", n);
    }

}