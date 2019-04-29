package es.studium.cajera;

public class Cliente
{

	private String nombre;
	private int[] carroCompra;
	// Constructor
	public Cliente(String n, int[] c){
		nombre = n;
		carroCompra = c;
		}
	// Inspectores
	public String getNombre(){
		return this.nombre;
		}
	public int[] getCarroCompra(){
		return carroCompra;
		}

}
