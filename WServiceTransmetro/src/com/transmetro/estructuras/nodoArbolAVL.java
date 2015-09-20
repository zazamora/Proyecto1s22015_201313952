package com.transmetro.estructuras;

public class nodoArbolAVL {
	public ArbolAVL hd;
    public ArbolAVL hi;
    public Informacion dato;
    public int fe;
    public String data;
    public String data2;
    public static int indice;
    public String nombre;
    public String nomI;
    public String nomD;

    public nodoArbolAVL()
    {
        this.fe = 0;
        this.hd = null;
        this.hi = null;
        this.dato = null;
        this.nombre = "t" + indice;

        this.data = this.nombre + "[ label = " + "\"" + "<iz> |<c> " + dato.getComparable() + "| <de>" + "\"" + " ];\n";

        indice++;
    }

    public nodoArbolAVL(Informacion u)
    {
        this.fe = 0;
        this.hd = null;
        this.hi = null;
        this.dato = u;
        this.nombre = "t" + indice;

        this.data = this.nombre + "[ label = " + "\"" + "<iz> |<c> " + dato.getComparable() + "| <de>" + "\"" + " ];\n";

        indice++;
    }
}
