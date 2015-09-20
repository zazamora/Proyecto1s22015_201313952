package com.transmetro.ws;

public class ImplServiceProxy implements com.transmetro.ws.ImplService {
  private String _endpoint = null;
  private com.transmetro.ws.ImplService implService = null;
  
  public ImplServiceProxy() {
    _initImplServiceProxy();
  }
  
  public ImplServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initImplServiceProxy();
  }
  
  private void _initImplServiceProxy() {
    try {
      implService = (new com.transmetro.ws.ImplServiceServiceLocator()).getImplService();
      if (implService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)implService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)implService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (implService != null)
      ((javax.xml.rpc.Stub)implService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.transmetro.ws.ImplService getImplService() {
    if (implService == null)
      _initImplServiceProxy();
    return implService;
  }
  
  public void crearRuta(com.transmetro.estructuras.Ruta ruta) throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    implService.crearRuta(ruta);
  }
  
  public void crearChofer(com.transmetro.estructuras.Chofer chofer) throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    implService.crearChofer(chofer);
  }
  
  public java.lang.String getGraphAVLAdmin() throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.getGraphAVLAdmin();
  }
  
  public com.transmetro.estructuras.ListaDoble getListaBuses() throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.getListaBuses();
  }
  
  public com.transmetro.estructuras.Informacion validaLogin(java.lang.String id, java.lang.String pass, int tipo) throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.validaLogin(id, pass, tipo);
  }
  
  public void crearEstacion(com.transmetro.estructuras.Estacion estacion) throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    implService.crearEstacion(estacion);
  }
  
  public java.lang.String[] getChoferes() throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.getChoferes();
  }
  
  public java.lang.String[] getEstaciones() throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.getEstaciones();
  }
  
  public void crearAdmin(com.transmetro.estructuras.Informacion admin) throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    implService.crearAdmin(admin);
  }
  
  public java.lang.String verAdmins() throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.verAdmins();
  }
  
  public java.lang.String[] getRutas() throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.getRutas();
  }
  
  public void crearBus(com.transmetro.estructuras.Bus bus) throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    implService.crearBus(bus);
  }
  
  public java.lang.String[] getBuses() throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.getBuses();
  }
  
  public java.lang.String getGraphAVLChofer() throws java.rmi.RemoteException{
    if (implService == null)
      _initImplServiceProxy();
    return implService.getGraphAVLChofer();
  }
  
  
}