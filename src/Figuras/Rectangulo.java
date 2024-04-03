package Figuras;

import java.util.Scanner;

//Clase para un rectángulo
class Rectangulo extends Figura2D {
 private double base;
 private double altura;

 // Constructor
 Rectangulo() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese el lado 1 del rectángulo: ");
     this.base = scanner.nextDouble();
     System.out.println("Ingrese el lado 2 del rectángulo: ");
     this.altura = scanner.nextDouble();
     scanner.close();
 }

 // Implementación del método abstracto calcularArea()
 void calcularArea() {
     setArea(base * altura);
 }

 // Implementación del método abstracto calcularPerimetro()
 void calcularPerimetro() {
     setPerimetro(2 * (base + altura));
 }
}