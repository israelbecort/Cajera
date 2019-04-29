package es.studium.cajera;

public class Cliente2
{
	private String nombre;
	private int[] carroCompra;
	// Constructor
	public Cliente2(String n, int[] c){
		nombre = n;carroCompra = c;
		}
	// Inspectores
	public String getNombre(){
		return this.nombre;
		}
	public int[] getCarroCompra(){
		return carroCompra;
		}
}
