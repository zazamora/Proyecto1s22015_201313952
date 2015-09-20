/**
 * NodoDoble.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.estructuras;

public class NodoDoble  implements java.io.Serializable {
    private com.transmetro.estructuras.NodoDoble anterior;

    private com.transmetro.estructuras.Bus datos;

    private com.transmetro.estructuras.NodoDoble siguiente;

    public NodoDoble() {
    }

    public NodoDoble(
           com.transmetro.estructuras.NodoDoble anterior,
           com.transmetro.estructuras.Bus datos,
           com.transmetro.estructuras.NodoDoble siguiente) {
           this.anterior = anterior;
           this.datos = datos;
           this.siguiente = siguiente;
    }


    /**
     * Gets the anterior value for this NodoDoble.
     * 
     * @return anterior
     */
    public com.transmetro.estructuras.NodoDoble getAnterior() {
        return anterior;
    }


    /**
     * Sets the anterior value for this NodoDoble.
     * 
     * @param anterior
     */
    public void setAnterior(com.transmetro.estructuras.NodoDoble anterior) {
        this.anterior = anterior;
    }


    /**
     * Gets the datos value for this NodoDoble.
     * 
     * @return datos
     */
    public com.transmetro.estructuras.Bus getDatos() {
        return datos;
    }


    /**
     * Sets the datos value for this NodoDoble.
     * 
     * @param datos
     */
    public void setDatos(com.transmetro.estructuras.Bus datos) {
        this.datos = datos;
    }


    /**
     * Gets the siguiente value for this NodoDoble.
     * 
     * @return siguiente
     */
    public com.transmetro.estructuras.NodoDoble getSiguiente() {
        return siguiente;
    }


    /**
     * Sets the siguiente value for this NodoDoble.
     * 
     * @param siguiente
     */
    public void setSiguiente(com.transmetro.estructuras.NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NodoDoble)) return false;
        NodoDoble other = (NodoDoble) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anterior==null && other.getAnterior()==null) || 
             (this.anterior!=null &&
              this.anterior.equals(other.getAnterior()))) &&
            ((this.datos==null && other.getDatos()==null) || 
             (this.datos!=null &&
              this.datos.equals(other.getDatos()))) &&
            ((this.siguiente==null && other.getSiguiente()==null) || 
             (this.siguiente!=null &&
              this.siguiente.equals(other.getSiguiente())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAnterior() != null) {
            _hashCode += getAnterior().hashCode();
        }
        if (getDatos() != null) {
            _hashCode += getDatos().hashCode();
        }
        if (getSiguiente() != null) {
            _hashCode += getSiguiente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NodoDoble.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "NodoDoble"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "anterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "NodoDoble"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "datos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "Bus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siguiente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "siguiente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "NodoDoble"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
