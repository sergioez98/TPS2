
public class Clase {
	String Nombre;
	String Desc;
	String DiaClas;
	String HorarioClas;
	String Profesor;
	String Valor;
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Información de la Clase \n");
		sb.append("Nombre: " + this.Nombre + "\n");
		sb.append("Descripcion: " + this.Desc +"\n");
		sb.append("Dia de la Clase: " + this.DiaClas + "\n");
		sb.append("Horario de la Clase: " + this.HorarioClas + "\n");
		sb.append("Profesor: " + this.Profesor + "\n");
		sb.append("Valor: " + this.Valor + "\n");
		return sb.toString();
	}
}
