package arbol;

import javax.swing.JOptionPane;
import arbol.Arbol;
import arbol.Nodo_Arbol;

public class el_tri_en_binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int opcion = 0, elemento;
	String nombre;
	Arbol Pobre_Soñador	= new Arbol();
	
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar nodo \n" + "2.Recorrer"+ "3.Salir" , "MENU", JOptionPane.QUESTION_MESSAGE));
			
				switch(opcion)
				{
				case 1:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero para agregar", "Agregar nodo", JOptionPane.QUESTION_MESSAGE));
					nombre = JOptionPane.showInputDialog(null,"Cual sera el nombre del nodo");
			
					
					Pobre_Soñador.Agregar_nodo(elemento, nombre);
					break;
				
				case 2:
					if (!Pobre_Soñador.vacio() ){
					Pobre_Soñador.recorrido(Pobre_Soñador.raiz);
					}
					break;
				}
			
			}while(opcion!= 3);
	}

}
