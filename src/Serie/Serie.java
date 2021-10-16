/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie;

import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Serie {

    public int numero1 = 0;
    public int numero2 = 1;

    public void Ingresar() {

        Scanner tecla = new Scanner(System.in);

        int fila;
        int columna;

        do {

            System.out.println("N° Filas : ");

            fila = Integer.valueOf(tecla.nextLine());

        } while (this.controlIngreso(fila, 0) == 0);

        do {
            System.out.println("N° Columnas: ");

            columna = Integer.valueOf(tecla.nextLine());

        } while (this.controlIngreso(columna, 1) == 0);

        this.llenar(fila, columna);

    }

    public void llenar(int fila, int columna) {

        int i = 0;
        int j = 0;
        int n;

        int[][] elementos = new int[fila][columna];

        elementos[0][0] = this.numero1;
        elementos[0][1] = this.numero2;

        for (i = 0; i < fila; i++) {

            if (i == 0) {

                n = 2;

            } else {

                n = 0;
            }
            for (j = n; j < columna; j++) {

                if (j > 1) {
                    elementos[i][j] = elementos[i][j - 1] + elementos[i][j - 2];
                }

                if (i > 0 && j == 0) {
                    elementos[i][j] = elementos[i - 1][j + columna - 1] + elementos[i - 1][j + columna - 2];
                }

                if (i > 0 && j == 1) {
                    elementos[i][j] = elementos[i - 1][j + columna - 2] + elementos[i][j - 1];
                }

            }

        }

        this.imprimir(elementos);

    }

    public void imprimir(int[][] elementos) {
        int i, j;
        for (i = 0; i < elementos.length; i++) {
            for (j = 0; j < elementos[0].length; j++) {
                System.out.printf("%10s% -10d", "  ", elementos[i][j]);
            }
            System.out.println(" ");
        }
    }

    public int controlIngreso(int num, int m) {

        int x = 0;
        if (num > 1) {
            x = 1;
        } else {
            if (m == 0) {
                System.out.println("ERROR: N° de Fila mayor o igual a 2......");
            } else {
                System.out.println("ERROR: N° de Columna mayor o igual a 2........");
            }
        }

        return x;
    }
}
