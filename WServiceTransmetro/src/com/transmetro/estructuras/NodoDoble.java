package com.transmetro.estructuras;

public class NodoDoble {
	private Bus datos;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public Bus getDatos() {
        return datos;
    }
    
    public void setDatos(Bus datos) {
        this.siguiente = null;
        this.anterior = null;
        this.datos = datos;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble() {
        this.siguiente = null;
        this.anterior = null;
    }
}
