
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase t= new Clase();
		t.Nombre= "Tango";
		t.Desc="La clase consiste en media hora de calentamiento,"
				+ " media hora de practica de tecnicas y una hora de ensayo";
		t.DiaClas="Martes";
		t.HorarioClas="18:00";
		t.Profesor="Felipe Del Monte";
		t.Valor="300";
		System.out.println("Caracteristicas de la Clase \n");
		System.out.println(t.toString());
		System.out.println("Listado de Socios que concurren a la clase:\n");
		Registro reg = new Registro();
		reg.setCupo(6);
		reg.setListado(Socio.CrearSocios(2));
		
	}

}
