package com.transmetro.estructuras;

public class NodoDobleBus {
	private DataBus datos;
    private NodoDobleBus siguiente;
    private NodoDobleBus anterior;

    public DataBus getDatos() {
        return datos;
    }
    
    public void setDatos(DataBus datos) {
        this.siguiente = null;
        this.anterior = null;
        this.datos = datos;
    }

    public NodoDobleBus getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleBus siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDobleBus getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleBus anterior) {
        this.anterior = anterior;
    }

    public NodoDobleBus() {
        this.siguiente = null;
        this.anterior = null;
    }
}
