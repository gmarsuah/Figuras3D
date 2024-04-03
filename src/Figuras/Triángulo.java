package Figuras;


import java.util.Scanner;

class Triangulo extends Figura2D {
    private double lado1;
    private double lado2;
    private double lado3;

    Triangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado 1 del triángulo: ");
        this.lado1 = scanner.nextDouble();
        System.out.println("Ingrese el lado 2 del triángulo: ");
        this.lado2 = scanner.nextDouble();
        System.out.println("Ingrese el lado 3 del triángulo: ");
        this.lado3 = scanner.nextDouble();
        scanner.close();
    }

    void calcularArea() {
        // Fórmula de Herón
        double s = (lado1 + lado2 + lado3) / 2;
        setArea(Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3)));
        System.out.println("Calculo area");
    }

    void calcularPerimetro() {
        setPerimetro(lado1 + lado2 + lado3);
    }
}