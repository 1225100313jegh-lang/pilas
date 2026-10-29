package src;
/*
 *interface de la pila generica
 *Autor Juan Eduardo
 *Fecha 29/octubre/2026
*/
public interface IPila<T> {

	public void pop();//saca el ultimo de la pila
	public void push(T dato);//ingresa datos a la pila
	public T peek();//manda a llamar al ultimo de la lista
	public boolean isEmpty();//se pregunta si la lista esta vacia o no (devuelve true o false)
	
}