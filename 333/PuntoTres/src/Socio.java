import java.util.ArrayList;

public class Socio {
	String Nombre;
	int DNI;
	String FechaDeNacimiento;
	String FechaDeInscripcion;
	String Domicilio;
	int Telefono;
	boolean Pago;

	public static ArrayList<Socio> CrearSocios(int cantidad) {

		ArrayList<Socio> lista = new ArrayList<Socio>();
		Socio socio;
		
		for (int i = 0; i <= cantidad; i++) {
			socio = new Socio();
			socio.Nombre="socio " + i;
			socio.DNI = 23584267+i;
			socio.Domicilio= "Calle Falsa "+4567 +i;
			socio.Telefono = 1567829762+ i;
			lista.add(socio);
		}
		
		for (Socio soc : lista) {
			System.out.println(soc);
		}

		return lista;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Información del Socio \n");
		sb.append("Nombre: " + this.Nombre + "\n");
		sb.append("DNI: " + this.DNI +"\n");
		sb.append("Fecha de Nacimiento: " + this.FechaDeNacimiento + "\n");
		sb.append("Fecha de Inscripcion: " + this.FechaDeInscripcion + "\n");
		sb.append("Domicilio: " + this.Domicilio + "\n");
		sb.append("Telefono: " + this.Telefono + "\n");
		sb.append("Pago: " + this.Pago+ "\n");
	
		return sb.toString();
	}
}
