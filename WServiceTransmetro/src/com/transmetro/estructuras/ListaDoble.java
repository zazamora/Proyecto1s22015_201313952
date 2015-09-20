package com.transmetro.estructuras;

public class ListaDoble {
	private NodoDoble inicio;
    private NodoDoble fin;

    public ListaDoble() {
        inicio = null;
        fin = null;
    }
    public NodoDoble crearNodo(Bus info){
        NodoDoble nodo = new NodoDoble();
        if(info != null){
            nodo.setDatos(info);
            nodo.setAnterior(null);
            nodo.setSiguiente(null);
        }
        return nodo;
    }
    public boolean esVacio(){
        if(inicio != null)
            return false;
        return true;
    }
    public void insertarNodo(Bus info){
        NodoDoble temp = crearNodo(info);
        if(esVacio()){
            inicio = fin = temp;
        }else{
            NodoDoble aux = fin;
            fin = temp;
            fin.setAnterior(aux);
            aux.setSiguiente(fin);
        }
    }
    
    public void mostrarLista(){
        NodoDoble aux = inicio;
        if(esVacio()){
            System.out.println("Lista Vacia.");
        }else{
            while(aux != null){
                System.out.println("Datos: ");
                aux = aux.getSiguiente();
            }
        }
    }
    
    public int noNodos(){
    	int cantidad = 0;
    	NodoDoble aux = inicio;
    	while(aux != null){
            cantidad++;
            aux = aux.getSiguiente();
        }
    	return cantidad;
    }
    
    public NodoDoble getPrimero(){
        return inicio;
    }
}
