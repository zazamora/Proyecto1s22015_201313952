/**
 * ImplServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.ws;

public class ImplServiceServiceLocator extends org.apache.axis.client.Service implements com.transmetro.ws.ImplServiceService {

    public ImplServiceServiceLocator() {
    }


    public ImplServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImplServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImplService
    private java.lang.String ImplService_address = "http://localhost:8081/WServiceTransmetro/services/ImplService";

    public java.lang.String getImplServiceAddress() {
        return ImplService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImplServiceWSDDServiceName = "ImplService";

    public java.lang.String getImplServiceWSDDServiceName() {
        return ImplServiceWSDDServiceName;
    }

    public void setImplServiceWSDDServiceName(java.lang.String name) {
        ImplServiceWSDDServiceName = name;
    }

    public com.transmetro.ws.ImplService getImplService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImplService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImplService(endpoint);
    }

    public com.transmetro.ws.ImplService getImplService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.transmetro.ws.ImplServiceSoapBindingStub _stub = new com.transmetro.ws.ImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getImplServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImplServiceEndpointAddress(java.lang.String address) {
        ImplService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.transmetro.ws.ImplService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.transmetro.ws.ImplServiceSoapBindingStub _stub = new com.transmetro.ws.ImplServiceSoapBindingStub(new java.net.URL(ImplService_address), this);
                _stub.setPortName(getImplServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ImplService".equals(inputPortName)) {
            return getImplService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.transmetro.com", "ImplServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.transmetro.com", "ImplService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImplService".equals(portName)) {
            setImplServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
