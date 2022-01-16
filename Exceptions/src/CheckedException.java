import java.io.*;
import javax.swing.*;

//imprimir um arquivo no console.
public class CheckedException {

    public static void main(String[] args){
        String nomeDoArquivo = "Lista de Louvores Antigos.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
            "Arquivo inexistente ou digitado incorretamente." + e.getCause());
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado." + e.getCause());
        }
        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}
