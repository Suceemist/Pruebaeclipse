package prueba;

public class Contacto {
private String nombre, apellido;

public Contacto(String nombre, String apellido) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}
	
}
