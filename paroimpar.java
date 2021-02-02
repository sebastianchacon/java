import java.util.Scanner;

// hacemos publico el programa

public class NumeroParImpar
{
    // aqui creamos la funcion
    public static void main( String[] args )
    {
        // Hacemos que el numero que sea ingresado sea entero
        int numero;
        Scanner teclado = new Scanner( System.in );

        // Introducimos el numero por consola
        System.out.printf( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        // aca hacemos la logica del programa
        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }
    }
}