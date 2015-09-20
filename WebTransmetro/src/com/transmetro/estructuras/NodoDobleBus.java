/**
 * NodoDobleBus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.estructuras;

public class NodoDobleBus  implements java.io.Serializable {
    private com.transmetro.estructuras.NodoDobleBus anterior;

    private com.transmetro.estructuras.DataBus datos;

    private com.transmetro.estructuras.NodoDobleBus siguiente;

    public NodoDobleBus() {
    }

    public NodoDobleBus(
           com.transmetro.estructuras.NodoDobleBus anterior,
           com.transmetro.estructuras.DataBus datos,
           com.transmetro.estructuras.NodoDobleBus siguiente) {
           this.anterior = anterior;
           this.datos = datos;
           this.siguiente = siguiente;
    }


    /**
     * Gets the anterior value for this NodoDobleBus.
     * 
     * @return anterior
     */
    public com.transmetro.estructuras.NodoDobleBus getAnterior() {
        return anterior;
    }


    /**
     * Sets the anterior value for this NodoDobleBus.
     * 
     * @param anterior
     */
    public void setAnterior(com.transmetro.estructuras.NodoDobleBus anterior) {
        this.anterior = anterior;
    }


    /**
     * Gets the datos value for this NodoDobleBus.
     * 
     * @return datos
     */
    public com.transmetro.estructuras.DataBus getDatos() {
        return datos;
    }


    /**
     * Sets the datos value for this NodoDobleBus.
     * 
     * @param datos
     */
    public void setDatos(com.transmetro.estructuras.DataBus datos) {
        this.datos = datos;
    }


    /**
     * Gets the siguiente value for this NodoDobleBus.
     * 
     * @return siguiente
     */
    public com.transmetro.estructuras.NodoDobleBus getSiguiente() {
        return siguiente;
    }


    /**
     * Sets the siguiente value for this NodoDobleBus.
     * 
     * @param siguiente
     */
    public void setSiguiente(com.transmetro.estructuras.NodoDobleBus siguiente) {
        this.siguiente = siguiente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NodoDobleBus)) return false;
        NodoDobleBus other = (NodoDobleBus) obj;
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
        new org.apache.axis.description.TypeDesc(NodoDobleBus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "NodoDobleBus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "anterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "NodoDobleBus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "datos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "DataBus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siguiente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "siguiente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "NodoDobleBus"));
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
