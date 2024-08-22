import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa el monto para apostar");
        int suerte;
        int valor = 0;
        int pregunta= 0;
        valor = teclado.nextInt();
        do {
            Random aleatorio = new Random();
            suerte = aleatorio.nextInt(1, 4);
            if (suerte == 1) {
                valor = valor * 2;
                System.out.println("Ganaste el doble!, el valor final es : " + valor);

            } else if (suerte == 2) {
                valor = valor / 2;
                System.out.println("perdiste la mitad de tu dinero! el valor final es :" + valor);
            } else if (suerte == 3) {
                valor = valor - valor;
                System.out.println("perdiste todo! el valor final es :" + valor );
                break;
            }
            System.out.println("quieres seguir jugando? si = 1 , no = 0");
            pregunta=teclado.nextInt();
            if ( pregunta == 1 ){
                continue;

            }else{
                break;
            }
        } while ( suerte != 3);
        System.out.println( " se ha terminado el juego ");



    }
}

