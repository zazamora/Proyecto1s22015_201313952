/**
 * ImplServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.ws;

public interface ImplServiceService extends javax.xml.rpc.Service {
    public java.lang.String getImplServiceAddress();

    public com.transmetro.ws.ImplService getImplService() throws javax.xml.rpc.ServiceException;

    public com.transmetro.ws.ImplService getImplService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
