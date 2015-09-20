/**
 * ImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.ws;

public interface ImplService extends java.rmi.Remote {
    public void crearRuta(com.transmetro.estructuras.Ruta ruta) throws java.rmi.RemoteException;
    public void crearChofer(com.transmetro.estructuras.Chofer chofer) throws java.rmi.RemoteException;
    public java.lang.String getGraphAVLAdmin() throws java.rmi.RemoteException;
    public com.transmetro.estructuras.ListaDoble getListaBuses() throws java.rmi.RemoteException;
    public com.transmetro.estructuras.Informacion validaLogin(java.lang.String id, java.lang.String pass, int tipo) throws java.rmi.RemoteException;
    public void crearEstacion(com.transmetro.estructuras.Estacion estacion) throws java.rmi.RemoteException;
    public java.lang.String[] getChoferes() throws java.rmi.RemoteException;
    public java.lang.String[] getEstaciones() throws java.rmi.RemoteException;
    public void crearAdmin(com.transmetro.estructuras.Informacion admin) throws java.rmi.RemoteException;
    public java.lang.String verAdmins() throws java.rmi.RemoteException;
    public java.lang.String[] getRutas() throws java.rmi.RemoteException;
    public void crearBus(com.transmetro.estructuras.Bus bus) throws java.rmi.RemoteException;
    public java.lang.String[] getBuses() throws java.rmi.RemoteException;
    public java.lang.String getGraphAVLChofer() throws java.rmi.RemoteException;
}
