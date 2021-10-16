/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;


import Serie.Serie;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Kevin Cayo
 */
public class Principal {

    public static void main(String[] args) throws IOException {

        Serie serie = new Serie();
        serie.Ingresar();

        System.out.println("Hola mundo");
    }
    
    
}
