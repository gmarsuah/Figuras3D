package Figuras;


import java.util.Scanner;

class Esfera extends Figura3D {
    private double radio;

    Esfera() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera: ");
        this.radio = scanner.nextDouble();
        scanner.close();
    }

    void calcularArea() {
    	setArea(4 * Math.PI * radio * radio);
    }

    void calcularVolumen() {
        setVolumen((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));
    }
}