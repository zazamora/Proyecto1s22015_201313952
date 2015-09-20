/**
 * Chofer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.estructuras;

public class Chofer  implements java.io.Serializable {
    private java.lang.String apellido;

    private int clave;

    private java.lang.String contrasena;

    private com.transmetro.estructuras.ListaDobleBus listaBuses;

    private java.lang.String nombre;

    public Chofer() {
    }

    public Chofer(
           java.lang.String apellido,
           int clave,
           java.lang.String contrasena,
           com.transmetro.estructuras.ListaDobleBus listaBuses,
           java.lang.String nombre) {
           this.apellido = apellido;
           this.clave = clave;
           this.contrasena = contrasena;
           this.listaBuses = listaBuses;
           this.nombre = nombre;
    }


    /**
     * Gets the apellido value for this Chofer.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this Chofer.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the clave value for this Chofer.
     * 
     * @return clave
     */
    public int getClave() {
        return clave;
    }


    /**
     * Sets the clave value for this Chofer.
     * 
     * @param clave
     */
    public void setClave(int clave) {
        this.clave = clave;
    }


    /**
     * Gets the contrasena value for this Chofer.
     * 
     * @return contrasena
     */
    public java.lang.String getContrasena() {
        return contrasena;
    }


    /**
     * Sets the contrasena value for this Chofer.
     * 
     * @param contrasena
     */
    public void setContrasena(java.lang.String contrasena) {
        this.contrasena = contrasena;
    }


    /**
     * Gets the listaBuses value for this Chofer.
     * 
     * @return listaBuses
     */
    public com.transmetro.estructuras.ListaDobleBus getListaBuses() {
        return listaBuses;
    }


    /**
     * Sets the listaBuses value for this Chofer.
     * 
     * @param listaBuses
     */
    public void setListaBuses(com.transmetro.estructuras.ListaDobleBus listaBuses) {
        this.listaBuses = listaBuses;
    }


    /**
     * Gets the nombre value for this Chofer.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Chofer.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Chofer)) return false;
        Chofer other = (Chofer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellido==null && other.getApellido()==null) || 
             (this.apellido!=null &&
              this.apellido.equals(other.getApellido()))) &&
            this.clave == other.getClave() &&
            ((this.contrasena==null && other.getContrasena()==null) || 
             (this.contrasena!=null &&
              this.contrasena.equals(other.getContrasena()))) &&
            ((this.listaBuses==null && other.getListaBuses()==null) || 
             (this.listaBuses!=null &&
              this.listaBuses.equals(other.getListaBuses()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
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
        if (getApellido() != null) {
            _hashCode += getApellido().hashCode();
        }
        _hashCode += getClave();
        if (getContrasena() != null) {
            _hashCode += getContrasena().hashCode();
        }
        if (getListaBuses() != null) {
            _hashCode += getListaBuses().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Chofer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "Chofer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "clave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrasena");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "contrasena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaBuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "listaBuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "ListaDobleBus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
