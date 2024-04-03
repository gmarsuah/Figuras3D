package Figuras;


import java.util.Scanner;

class Circulo extends Figura2D {
    private double radio;

    // Constructor
    Circulo() {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        this.radio = scanner.nextDouble();
        System.out.println("Radio indicado:"+ this.radio); 
        scanner.close();
    }

    // Implementación del método abstracto calcularArea()
    void calcularArea() {
        setArea(Math.PI * radio * radio);
    }

    // Implementación del método abstracto calcularPerimetro()
    void calcularPerimetro() {
        setPerimetro(2 * Math.PI * radio);
    }
}
