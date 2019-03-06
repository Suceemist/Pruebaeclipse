package prueba;

public class consola {

	public static void main(String[] args) {
		String nombre="pepe";
		String apellido="perez";
		Contacto c= new Contacto(nombre, apellido);
		
		System.out.println("Nombre: "+c.getNombre()+", Apellido: "+c.getApellido()+"");
		
	}

}
