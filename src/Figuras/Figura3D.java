package Figuras;


abstract class Figura3D extends Figura {
	private double volumen;
    abstract void calcularVolumen();

    void mostrarInformacion() {
        System.out.println("Tipo de figura: " + this.getClass().getSimpleName());
        System.out.println("Área: " + getArea());
        System.out.println("Volumen: " + volumen);
    }
    double getVolumen() {
    	return this.volumen;
    }
    void setVolumen (double _volumen) {
    	this.volumen = _volumen;
    }
}
