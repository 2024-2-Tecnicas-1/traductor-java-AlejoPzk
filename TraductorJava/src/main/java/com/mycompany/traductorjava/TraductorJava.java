package com.mycompany.traductorjava;

import java.util.HashMap;
import java.util.Scanner;

public class TraductorJava {


    private static final HashMap<Integer, String> spanishDict = new HashMap<>(); 
    private static final HashMap<Integer, String> englishDict = new HashMap<>();
    static {
        spanishDict.put(0, "cero");
        spanishDict.put(1, "uno");
        spanishDict.put(2, "dos");
        spanishDict.put(3, "tres");
        spanishDict.put(4, "cuatro");
        spanishDict.put(5, "cinco");
        spanishDict.put(6, "seis");
        spanishDict.put(7, "siete");
        spanishDict.put(8, "ocho");
        spanishDict.put(9, "nueve");
        spanishDict.put(10, "diez");
        
        englishDict.put(0, "zero");
        englishDict.put(1, "one");
        englishDict.put(2, "two");
        englishDict.put(3, "three");
        englishDict.put(4, "four");
        englishDict.put(5, "five");
        englishDict.put(6, "six");
        englishDict.put(7, "seven");
        englishDict.put(8, "eight");
        englishDict.put(9, "nine");
        englishDict.put(10, "ten");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número (0-10): ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número (0-10): ");
        int num2 = scanner.nextInt();
        if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10) {
            System.out.println("Error: Los números deben estar en el rango de 0 a 10");
            return;
        }
        int suma = num1 + num2;
        String num1Sp = spanishDict.get(num1);
        String num2Sp = spanishDict.get(num2);
        String sumaSp = spanishDict.get(suma);
        String num1En = englishDict.get(num1);
        String num2En = englishDict.get(num2);
        String sumaEn = englishDict.get(suma);
        System.out.println("La suma de " + num1Sp + " más " + num2Sp + " es " + sumaSp);
        System.out.println("The sum of " + num1En + " plus " + num2En + " is " + sumaEn);
    }
}
