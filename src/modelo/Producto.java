package modelo;

public class Producto {
	private String nombre;
	private String cantidad;
	private String costo;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(String nombre, String cantidad, String costo) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.costo = costo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", costo=" + costo + "]";
	}
	
	

	
}
