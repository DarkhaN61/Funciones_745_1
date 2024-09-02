package com.sigmotoa.funcion_1;

import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        saludar();
        System.out.println("Hello, type your name");
        String name = leer.next();
        System.out.println("escribe dos numeros para la suma");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = funcionSuma(num1, num2);
        System.out.println("la suma de los numeros es :" + suma);
        System.out.println("escribe dos numeros para multiplicar con la suma");
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        int mul = funcionMultiplicacion(num3, num4);
        System.out.println("la multiplicacion es: " + mul);
        System.out.println("ingresa el numero del que quieres saber el factorial");
        int f = leer.nextInt();
        long f2 = (long) funcionfactorial(f);
        System.out.println("el factorial es:" +f2);
        System.out.println(name + " type an edge for the square");
        int lado = leer.nextInt();
        int area = areaCuadrado(lado);
        System.out.println("The area of the square is: " + area);
        mayus(name);
        System.out.println("escribe el radio del circulo");
        int r = leer.nextInt();
        double r2 = areaCirculo(r);
        System.out.println("el area del circulo es:" +r2);
        System.out.println("escribe el radio y altura del cono");
        int rc = leer.nextInt();
        int h = leer.nextInt();
        double v = volumencono(rc, h);
        System.out.println("el volumen del cono es: " +v);
        System.out.println("escribe cuantos numeros deseas generar");
        int d = leer.nextInt();
        long nf = ciclofibonacci(d);
        System.out.println("el numero es: " +nf);
        System.out.println("The current year is: "+currentYear());
    }

    public static int funcionSuma (int num1, int num2) {
        return num2 + num1;
    }
    public static int funcionMultiplicacion (int num3, int num4){
        return num4 * num3;
    }
    public static double funcionfactorial(int n){
        double aux = 1;
        for( int i = 2; i <= n; i++ ){
            aux *= i;
        }
        return aux;
    }
    //Recibe, pero no retorna
    public static void mayus(String nombre) {
        System.out.println(nombre.toUpperCase());
    }

    //No Recibe, no retorna
    public static void saludar() {
        System.out.println("Hola");
    }

    //Recibe 1, retorna
    public static int areaCuadrado(int lado) {
        return lado * lado;
    }
    public static double areaCirculo(int r){
     return (double) r*r * Math.PI;
    }
    public static double volumencono (int rc, int h){
        return Math.PI*rc*rc*h/3;
    }
    public static long ciclofibonacci(int n){
        int f = 0;
        int t1 = 1;
        int t2;
        for(int i= 1; i<=n; i++){
            t2 = f;
            f= t1 + f;
            t1 = t2;
        }
        return t1;
    }
    //No Recibe, retorna
    public static int currentYear()
    {
        return 2024;
    }

    /*
    Crear funciones para las siguientes situaciones
    1. Sumar 2 numeros
    2. Multiplicar 2 numeros con las sumas del 1
    3. Potenciar 2 numeros con las sumas del 1
    4. Calcular el factorial de 1 numero
    5. Calcular el area de un cuadrado(recibiendo un lado)
    6. Calcular el area de un circulo(recibiendo el radio)
    7. Calcular el volumen de un cono(recibiendo el radio y la altura
    8. Mostrar los n numeros de la serie de fibonacci(recibiendo n)

    Todas las funciones deben ser llamadas desde el Main.
     */

}
