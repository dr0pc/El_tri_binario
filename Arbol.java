package arbol;

public class Arbol {

	Nodo_Arbol raiz;
	
	
	public Arbol()
	{
		raiz = null;
	}
	
	
	// Metodo para insertar un nodo en el arbol
	
	public void Agregar_nodo (int d, String nom)
	{
		Nodo_Arbol nuevo = new Nodo_Arbol(d, nom);
		
		if(raiz == null)
		{
			raiz = nuevo;
		}
		
		else 
		{
		Nodo_Arbol auxiliar = raiz;
		Nodo_Arbol padre;
			while (true)
			{
			
			padre = auxiliar;
				if (d < auxiliar.dato)
				{
					auxiliar = auxiliar.hijoizquierdo;
				
					if(auxiliar == null)
					{
					padre.hijoizquierdo = nuevo;
					return;
					} 
				}
				else 
				{
					auxiliar = auxiliar.hijoderecho;
						if (auxiliar == null)
						{
							padre.hijoderecho = nuevo;
							return;
						}
				}
				
			}
			
		}
	
		
	}

public void recorrido(Nodo_Arbol Raiz )
	{
	if (Raiz != null)
		{
		recorrido(Raiz.hijoizquierdo);
		System.out.println(Raiz.dato);
		recorrido(Raiz.hijoderecho);
		}
	}

// Falta funcion para verificar si esta vacio

public boolean vacio()
{
	return raiz==null;
	}
}
