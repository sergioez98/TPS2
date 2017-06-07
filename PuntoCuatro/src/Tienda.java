
public class Tienda {
	public float Precio;
	// Aca utilizamos encapsulamiento, en este hay tres tipos public, private y
	// protected.
	String Talle;
	String Color;
	int Stock;

	public void ActualizarStock(int i) {
		this.Stock = i;
		System.out.println("Hay Stock "+i);

	}

	public void ActualizarStock() {
		this.Stock = 0;
		System.out.println("no recibe nada");

	}

}
