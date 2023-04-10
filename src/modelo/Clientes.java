package modelo;

public class Clientes {
	private String nombre;
	private String edad;
	private String mail;
	private String dni;
	public Clientes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clientes(String nombre, String edad, String mail, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.mail = mail;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", edad=" + edad + ", mail=" + mail + ", dni=" + dni + "]";
	}
	
	

}
