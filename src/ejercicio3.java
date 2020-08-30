import java.util.Scanner;

/**Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
 * (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media,
 * la nota más alta que ha sacado y la menor.*/
public class ejercicio3
{
    //definimos el vector notas
    int[] notas;

    Scanner scanner;

    //metodo constructor
    public ejercicio3()
    {
        notas = new int[5];

        scanner= new Scanner(System.in);
    }

    //metodo ejeutar
    public void ejecutar(){
        //notas comprendidas entre el 0 y el 10
        for (int i = 0; i < notas.length; i++)
        {
            System.out.println("notas [" + i + "]:");
            int nota = scanner.nextInt();

            notas[i] = nota;
        }

        //mostramos contenido de notas
        double suma =0;
        double promedio;
        int minimo =10; //el valor mas alto
        int maximo =0;

        for (int i = 0; i < notas.length; i++)
        {
            System.out.println("notas [" + i + "]: " + notas[i]); //muestra las notas

            suma= suma+notas[i];

            if (notas[i]< minimo)
            {
                minimo=notas[i];
            }
            if (notas[i] >maximo)
            {
                maximo=notas[i];
            }
        }

        promedio = suma / notas.length;

        System.out.println("promedio: "+ promedio);
        System.out.println("maximo: "+ maximo);
        System.out.println("minimo: "+ minimo);
    }
}

