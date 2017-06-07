import java.util.ArrayList;

public class Registro {
	private ArrayList<Socio> listado;
	private int cupo;
	private boolean descuento;
	public ArrayList<Socio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Socio> listado) {
		if(listado.size()<=cupo){
		this.listado = listado;
		System.out.println("Socios asignados correctamente");
		}
		else {
			int resto=listado.size()-cupo;
			System.out.println("Cupo exedido: "+resto);
		}
	}
	public int getCupo() {
		return cupo;
	}
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	
}
