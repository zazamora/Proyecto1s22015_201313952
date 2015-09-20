package com.transmetro.estructuras;

public class ListaDobleBus {
	private NodoDobleBus inicio;
    private NodoDobleBus fin;

    public ListaDobleBus() {
        inicio = null;
        fin = null;
    }
    public NodoDobleBus crearNodo(DataBus info){
        NodoDobleBus nodo = new NodoDobleBus();
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
    public void insertarNodo(DataBus info){
        NodoDobleBus temp = crearNodo(info);
        if(esVacio()){
            inicio = fin = temp;
        }else{
            NodoDobleBus aux = fin;
            fin = temp;
            fin.setAnterior(aux);
            aux.setSiguiente(fin);
        }
    }
    
    public void mostrarLista(){
        NodoDobleBus aux = inicio;
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
    	NodoDobleBus aux = inicio;
    	while(aux != null){
            cantidad++;
            aux = aux.getSiguiente();
        }
    	return cantidad;
    }
    
    public NodoDobleBus getPrimero(){
        return inicio;
    }
}
