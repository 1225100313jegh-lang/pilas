package src;
import java.util.EmptyStackException;
/*
 *interface de la pila generica
 *Autor Juan Eduardo
 *Fecha 29/octubre/2026
*/
public  class PilaArreglo <T> implements IPila <T> {
	private T[] datos;
	private int tope;
	@SuppressWarnings("unchecked")
    	public PilaArreglo() {
        	datos = (T[]) new Object[5];  // capacidad inicial: 5
        	tope = 0;                      // la pila empieza vacía
    	}
	public void pop() {
    		if (isEmpty()) {
        		throw new EmptyStackException();
    		}
    		tope--;          // retrocede el tope
    		datos[tope] = null;   // libera la referencia
	}
	@Override
	public void push(T dato) {
	    datos[tope] = dato;  // guarda en la siguiente posición libre
	    tope++;          // el tope avanza
	}
	@Override
	public T peek() {
    		if (isEmpty()) {
        		throw new EmptyStackException();
    		}
    	return datos[tope-1];  // recuerda: el elemento de arriba no está en tope
}
	@Override
	public boolean isEmpty(){
		return tope == 0;
	}

public static void main(String[] args){
	IPila<Integer> pila = new PilaArreglo<>();
	for (int i = 1; i <= 6; i++) {
	    pila.push(i);
	    }
    	System.out.println(pila.peek());
    	pila.pop();
    	pila.pop();
    	System.out.println(pila.isEmpty());
}	
}

