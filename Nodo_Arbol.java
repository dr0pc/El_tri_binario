package arbol;

public class Nodo_Arbol {

	int dato;	
	String nombre;
	
	Nodo_Arbol hijoizquierdo, hijoderecho; 

	 public Nodo_Arbol (int d, String nom)
	{
		this.dato = d;
		this.nombre = nom;
		this.hijoderecho = null;
		this.hijoizquierdo = null;	
	}
	 
public String toString()
  	{
	 return nombre + "El dato es: " + dato;
  	}
	 
}
