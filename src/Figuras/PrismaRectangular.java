package Figuras;


import java.util.Scanner;

class PrismaRectangular extends Figura3D {
    private double baseLado1;
    private double baseLado2;
    private double altura;

    PrismaRectangular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del lado 1 de la base del prisma rectangular: ");
        this.baseLado1 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del lado 2 de la base del prisma rectangular: ");
        this.baseLado2 = scanner.nextDouble();
        System.out.println("Ingrese la altura del prisma rectangular: ");
        this.altura = scanner.nextDouble();
        scanner.close();
    }

    void calcularArea() {
    	setArea(2 * (baseLado1 * baseLado2 + baseLado1 * altura + baseLado2 * altura));
    }

    void calcularVolumen() {
        setVolumen(baseLado1 * baseLado2 * altura);
    }
}
