/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ingconocimiento;
import java.util.Scanner;

/**
 *
 * @author 100017408
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int respuesta = 0;
        float porcentaje = 0;
        Scanner r = new Scanner(System.in);
        
        System.out.println("1. Nunca");
        System.out.println("2. A veces");
        System.out.println("3. Siempre");
        System.out.println("\n");
        System.out.println("\n");
        
        
        System.out.println
        ("1.	En el último mes, ¿con que frecuencia ha estado afectado por algo que ha ocurrido inesperadamente?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje +=.01;
            case 2 -> porcentaje +=.03;
            case 3 -> porcentaje +=.09;
            default -> {
            }
        }
        System.out.println
        ("2.	En el último mes, ¿con que frecuencia se ha sentido incapaz de controlar las cosas importantes en su vida?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje +=.01;
            case 2 -> porcentaje +=.03;
            case 3 -> porcentaje +=.05;
            default -> {
            }
        }
        System.out.println
        ("3.	En el último mes, ¿con que frecuencia se ha sentido nervioso o estresado?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje +=.01;
            case 2 -> porcentaje +=.03;
            case 3 -> porcentaje +=.05;
            default -> {
            }
        }
        System.out.println
        ("4.	En el último mes, ¿con que frecuencia ha manejado con éxito los pequeños problemas irritantes de la vida?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .09;
            case 2 -> porcentaje +=.03;
            case 3 -> porcentaje +=.01;
            default -> {
            }
        }
        System.out.println
        ("5.	En el último mes, ¿con que frecuencia ha sentido que ha afrontado efectivamente los cambios importantes que han estado ocurriendo en su vida?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .05;
            case 2 -> porcentaje +=.03;
            case 3 -> porcentaje +=.01;
            default -> {
            }
        }
        System.out.println
        ("6.	En el último mes, ¿con que frecuencia ha estado seguro sobre su capacidad para manejar sus problemas personales?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .05;
            case 2 -> porcentaje +=.03;
            case 3 -> porcentaje +=.01;
            default -> {
            }
        }
        System.out.println
        ("7.	En el último mes, ¿con que frecuencia ha sentido que las cosas le van bien?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .05;
            case 2 -> porcentaje +=.03;
            case 3 -> porcentaje +=.01;
            default -> {
            }
        }
        System.out.println
        ("8.	En el último mes, ¿con que frecuencia ha sentido que no podía afrontar todas las cosas que tenía que hacer?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje +=.01;
            case 2 -> porcentaje +=.02;
            case 3 -> porcentaje +=.05;
            default -> {
            }
        }
        System.out.println
        ("9.	En el último mes, ¿con que frecuencia ha podido controlar las dificultades de su vida?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .05;
            case 2 -> porcentaje +=.02;
            case 3 -> porcentaje +=.01;
            default -> {
            }
        }
        System.out.println
        ("10.   En el último mes, ¿con que frecuencia ha estado enfadado porque las cosas que le han ocurrido estaban fuera de su control?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje +=.01;
            case 2 -> porcentaje +=.04;
            case 3 -> porcentaje +=.09;
            default -> {
            }
        }
       
        
        System.out.println(porcentaje);
        if (porcentaje >= .85) {
            System.out.println("Muy Probablemente padeces de un transtorno de bipolaridad");
        }else if (porcentaje >= .7 && porcentaje < .85) {
            System.out.println("Probablemente haz sufrido un episodio maniáco ¡BUSCA AYUDA!");
        }else if (porcentaje >= .35 && porcentaje < .7) {
            System.out.println("Existe un bajo riesgo de que padezcas un transtorno de bipolaridad");
        }else{
            System.out.println("Al parecer no padeces de bipolaridad, pero puedes tener un problema mental. Visitar un psicologo es saludable.");
        }


/*
        int respuesta = 0;
        float porcentaje = 0;
        Scanner r = new Scanner(System.in);
        
        System.out.println("1. Nunca");
        System.out.println("2. Una a dos veces");
        System.out.println("3. De tres a cinco veces");
        System.out.println("4. Cinco o mas de cinco veces");
        System.out.println("5. Siempre");
        System.out.println("\n");
        System.out.println("\n");
        
        System.out.println
        ("1.	En el último mes, ¿con que frecuencia ha estado afectado por algo que ha ocurrido inesperadamente?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .01;
            case 2 -> porcentaje +=.1;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.5;
            case 5 -> porcentaje += 1;
            default -> {
            }
        }
        System.out.println
        ("2.	En el último mes, ¿con que frecuencia se ha sentido incapaz de controlar las cosas importantes en su vida?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .01;
            case 2 -> porcentaje +=.1;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.5;
            case 5 -> porcentaje += 1;
            default -> {
            }
        }
        System.out.println
        ("3.	En el último mes, ¿con que frecuencia se ha sentido nervioso o estresado?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .01;
            case 2 -> porcentaje +=.1;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.5;
            case 5 -> porcentaje += 1;
            default -> {
            }
        }
        System.out.println
        ("4.	En el último mes, ¿con que frecuencia ha manejado con éxito los pequeños problemas irritantes de la vida?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += 1;
            case 2 -> porcentaje +=.5;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.1;
            case 5 -> porcentaje += .01;
            default -> {
            }
        }
        System.out.println
        ("5.	En el último mes, ¿con que frecuencia ha sentido que ha afrontado efectivamente los cambios importantes que han estado ocurriendo en su vida?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += 1;
            case 2 -> porcentaje +=.5;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.1;
            case 5 -> porcentaje += .01;
            default -> {
            }
        }
        System.out.println
        ("6.	En el último mes, ¿con que frecuencia ha estado seguro sobre su capacidad para manejar sus problemas personales?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += 1;
            case 2 -> porcentaje +=.5;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.1;
            case 5 -> porcentaje += .01;
            default -> {
            }
        }
        System.out.println
        ("7.	En el último mes, ¿con que frecuencia ha sentido que las cosas le van bien?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += 1;
            case 2 -> porcentaje +=.5;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.1;
            case 5 -> porcentaje += .01;
            default -> {
            }
        }
        System.out.println
        ("8.	En el último mes, ¿con que frecuencia ha sentido que no podía afrontar todas las cosas que tenía que hacer?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .01;
            case 2 -> porcentaje +=.1;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.5;
            case 5 -> porcentaje += 1;
            default -> {
            }
        }
        System.out.println
        ("9.	En el último mes, ¿con que frecuencia ha podido controlar las dificultades de su vida?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += 1;
            case 2 -> porcentaje +=.5;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.1;
            case 5 -> porcentaje += .01;
            default -> {
            }
        }
        System.out.println
        ("10.	En el último mes, ¿con que frecuencia se ha sentido que tenía todo bajo control?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += 1;
            case 2 -> porcentaje +=.5;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.1;
            case 5 -> porcentaje += .01;
            default -> {
            }
        }
        System.out.println
        ("11.	En el último mes, ¿con que frecuencia ha estado enfadado porque las cosas que le han ocurrido estaban fuera de su control?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .01;
            case 2 -> porcentaje +=.1;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.5;
            case 5 -> porcentaje += 1;
            default -> {
            }
        }
        System.out.println
        ("12.	En el último mes, ¿con que frecuencia ha pensado sobre las cosas que le quedan por hacer?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += .01;
            case 2 -> porcentaje +=.1;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.5;
            case 5 -> porcentaje += 1;
            default -> {
            }
        }
        System.out.println
        ("13.	En el último mes, ¿con que frecuencia ha podido controlar la forma de pasar el tiempo?");
        respuesta = r.nextInt();
        switch(respuesta){
            case 1 -> porcentaje += 1;
            case 2 -> porcentaje +=.5;
            case 3 -> porcentaje +=.3;
            case 4 -> porcentaje +=.1;
            case 5 -> porcentaje += .01;
            default -> {
            }
        }
        
        porcentaje=porcentaje/13;
        System.out.println("porcentaje "+ porcentaje);
        if (porcentaje >= 1) {
            System.out.println("Probablemente padeces de un transtorno de bipolaridad");
        }else if (porcentaje >= .7 && porcentaje < 1) {
            System.out.println("Probablemente haz sufrido un episodio maniáco ¡BUSCA AYUDA!");
        }else if (porcentaje >= .50 && porcentaje < .70) {
            System.out.println("Existe un bajo riesgo de que padezcas un transtorno de bipolaridad");
        }else{
            System.out.println("Al parecer no padeces de bipolaridad, pero puedes tener un problema mental");
        }
*/
    }
    
}
