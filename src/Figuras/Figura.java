package Figuras;


//Definición de la clase abstracta Figura
abstract class Figura {
 // Variable para almacenar el área
  private double area;
 
 // Método abstracto para calcular el área
 abstract void calcularArea();
 
 // Método para obtener el área calculada
 double getArea() {
     return area;
 }
 void setArea(double _area){
	 this.area = _area;
 }
 
}