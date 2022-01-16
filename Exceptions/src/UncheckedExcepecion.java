
import javax.swing.JOptionPane;

public class UncheckedExcepecion {

    public static void main(String[] args) {

        boolean looping;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            looping = true;

            try {
                int resultado = Dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("resultado: " + resultado);
                looping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
            } finally {
                System.out.println("Finally");
            }
        } while (looping);

    }
    public static int Dividir(int numerador, int denominador){
        return numerador / denominador;
    }
}
