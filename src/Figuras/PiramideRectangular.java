package Figuras;


import java.util.Scanner;

class PiramideRectangular extends Figura3D {
    private double baseLado1;
    private double baseLado2;
    private double altura;

    PiramideRectangular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del lado 1 de la base de la pirámide rectangular: ");
        this.baseLado1 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del lado 2 de la base de la pirámide rectangular: ");
        this.baseLado2 = scanner.nextDouble();
        System.out.println("Ingrese la altura de la pirámide rectangular: ");
        this.altura = scanner.nextDouble();
        scanner.close();
    }

    void calcularArea() {
        setArea(baseLado1 * baseLado2 + 2 * baseLado1 * Math.sqrt((baseLado2 / 2) * (baseLado2 / 2) + altura * altura)
                + 2 * baseLado2 * Math.sqrt((baseLado1 / 2) * (baseLado1 / 2) + altura * altura));
    }

    void calcularVolumen() {
        setVolumen((baseLado1 * baseLado2 * altura) / 3.0);
    }
}