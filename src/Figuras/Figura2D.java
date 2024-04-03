package Figuras;


//Definición de la clase abstracta Figura2D, hija de Figura
abstract class Figura2D extends Figura {
 private double perimetro;
 // Método abstracto para calcular el perímetro
 abstract void calcularPerimetro();

 // Método para mostrar la información de la figura
 void mostrarInformacion() {
     System.out.println("Tipo de figura: " + this.getClass().getSimpleName());
     System.out.println("Área: " + getArea());
     System.out.println("Perímetro: " + perimetro);
 }
 double getPerimetro() {
	 return perimetro;
 }
 void setPerimetro(double _perimetro) {
	 this.perimetro = _perimetro;
 }
}
