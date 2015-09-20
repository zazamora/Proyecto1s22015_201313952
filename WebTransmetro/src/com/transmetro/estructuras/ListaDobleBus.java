/**
 * ListaDobleBus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.estructuras;

public class ListaDobleBus  implements java.io.Serializable {
    private com.transmetro.estructuras.NodoDobleBus primero;

    public ListaDobleBus() {
    }

    public ListaDobleBus(
           com.transmetro.estructuras.NodoDobleBus primero) {
           this.primero = primero;
    }


    /**
     * Gets the primero value for this ListaDobleBus.
     * 
     * @return primero
     */
    public com.transmetro.estructuras.NodoDobleBus getPrimero() {
        return primero;
    }


    /**
     * Sets the primero value for this ListaDobleBus.
     * 
     * @param primero
     */
    public void setPrimero(com.transmetro.estructuras.NodoDobleBus primero) {
        this.primero = primero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaDobleBus)) return false;
        ListaDobleBus other = (ListaDobleBus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primero==null && other.getPrimero()==null) || 
             (this.primero!=null &&
              this.primero.equals(other.getPrimero())));
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
        if (getPrimero() != null) {
            _hashCode += getPrimero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaDobleBus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "ListaDobleBus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "primero"));
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
