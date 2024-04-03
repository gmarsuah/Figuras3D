package Figuras;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
            System.out.println("¿Qué figura desea crear? (opciones) : ");
            System.out.println("1.- Círculo; 2.- Rectángulo; 3.- Triángulo; 4.- Esfera; 5.- Piramide Rectangular; 6.- Prisma Rectangular");
            System.out.println("Pulse cualquier otra tecla para salir");
            input = scanner.nextLine();

            switch (input) {
            	case "1":
            		Circulo circulo = new Circulo();
            		circulo.calcularArea();
            		circulo.calcularPerimetro();
            		circulo.mostrarInformacion();
            		break;
            	case "2":
            		Rectangulo rectangulo = new Rectangulo();
            		rectangulo.calcularArea();
            		rectangulo.calcularPerimetro();
            		rectangulo.mostrarInformacion();
            		break;
            	case "3":
            		Triangulo triangulo = new Triangulo();
            		triangulo.calcularArea();
            		triangulo.calcularPerimetro();
            		triangulo.mostrarInformacion();
            		break;
                case "4":
                    Esfera esfera = new Esfera();
                    esfera.calcularArea();
                    esfera.calcularVolumen();
                    esfera.mostrarInformacion();
                    break;
                case "5":
                    PiramideRectangular piramide = new PiramideRectangular();
                    piramide.calcularArea();
                    piramide.calcularVolumen();
                    piramide.mostrarInformacion();
                    break;
                case "6":
                    PrismaRectangular prisma = new PrismaRectangular();
                    prisma.calcularArea();
                    prisma.calcularVolumen();
                    prisma.mostrarInformacion();
                    break;
                default:
                    break;
            }
        scanner.close();
    }
}
