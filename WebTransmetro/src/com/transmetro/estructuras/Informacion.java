/**
 * Informacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.estructuras;

public class Informacion  implements java.io.Serializable {
    private java.lang.String apellido;

    private com.transmetro.estructuras.Chofer chofer;

    private java.lang.String clave;

    private java.lang.String comparable;

    private java.lang.String contrasena;

    private java.lang.String correo;

    private com.transmetro.estructuras.Estacion estacion;

    private int id;

    private java.lang.String mensaje;

    private java.lang.String nombre;

    public Informacion() {
    }

    public Informacion(
           java.lang.String apellido,
           com.transmetro.estructuras.Chofer chofer,
           java.lang.String clave,
           java.lang.String comparable,
           java.lang.String contrasena,
           java.lang.String correo,
           com.transmetro.estructuras.Estacion estacion,
           int id,
           java.lang.String mensaje,
           java.lang.String nombre) {
           this.apellido = apellido;
           this.chofer = chofer;
           this.clave = clave;
           this.comparable = comparable;
           this.contrasena = contrasena;
           this.correo = correo;
           this.estacion = estacion;
           this.id = id;
           this.mensaje = mensaje;
           this.nombre = nombre;
    }


    /**
     * Gets the apellido value for this Informacion.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this Informacion.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the chofer value for this Informacion.
     * 
     * @return chofer
     */
    public com.transmetro.estructuras.Chofer getChofer() {
        return chofer;
    }


    /**
     * Sets the chofer value for this Informacion.
     * 
     * @param chofer
     */
    public void setChofer(com.transmetro.estructuras.Chofer chofer) {
        this.chofer = chofer;
    }


    /**
     * Gets the clave value for this Informacion.
     * 
     * @return clave
     */
    public java.lang.String getClave() {
        return clave;
    }


    /**
     * Sets the clave value for this Informacion.
     * 
     * @param clave
     */
    public void setClave(java.lang.String clave) {
        this.clave = clave;
    }


    /**
     * Gets the comparable value for this Informacion.
     * 
     * @return comparable
     */
    public java.lang.String getComparable() {
        return comparable;
    }


    /**
     * Sets the comparable value for this Informacion.
     * 
     * @param comparable
     */
    public void setComparable(java.lang.String comparable) {
        this.comparable = comparable;
    }


    /**
     * Gets the contrasena value for this Informacion.
     * 
     * @return contrasena
     */
    public java.lang.String getContrasena() {
        return contrasena;
    }


    /**
     * Sets the contrasena value for this Informacion.
     * 
     * @param contrasena
     */
    public void setContrasena(java.lang.String contrasena) {
        this.contrasena = contrasena;
    }


    /**
     * Gets the correo value for this Informacion.
     * 
     * @return correo
     */
    public java.lang.String getCorreo() {
        return correo;
    }


    /**
     * Sets the correo value for this Informacion.
     * 
     * @param correo
     */
    public void setCorreo(java.lang.String correo) {
        this.correo = correo;
    }


    /**
     * Gets the estacion value for this Informacion.
     * 
     * @return estacion
     */
    public com.transmetro.estructuras.Estacion getEstacion() {
        return estacion;
    }


    /**
     * Sets the estacion value for this Informacion.
     * 
     * @param estacion
     */
    public void setEstacion(com.transmetro.estructuras.Estacion estacion) {
        this.estacion = estacion;
    }


    /**
     * Gets the id value for this Informacion.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Informacion.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the mensaje value for this Informacion.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this Informacion.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the nombre value for this Informacion.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Informacion.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Informacion)) return false;
        Informacion other = (Informacion) obj;
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
            ((this.chofer==null && other.getChofer()==null) || 
             (this.chofer!=null &&
              this.chofer.equals(other.getChofer()))) &&
            ((this.clave==null && other.getClave()==null) || 
             (this.clave!=null &&
              this.clave.equals(other.getClave()))) &&
            ((this.comparable==null && other.getComparable()==null) || 
             (this.comparable!=null &&
              this.comparable.equals(other.getComparable()))) &&
            ((this.contrasena==null && other.getContrasena()==null) || 
             (this.contrasena!=null &&
              this.contrasena.equals(other.getContrasena()))) &&
            ((this.correo==null && other.getCorreo()==null) || 
             (this.correo!=null &&
              this.correo.equals(other.getCorreo()))) &&
            ((this.estacion==null && other.getEstacion()==null) || 
             (this.estacion!=null &&
              this.estacion.equals(other.getEstacion()))) &&
            this.id == other.getId() &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
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
        if (getChofer() != null) {
            _hashCode += getChofer().hashCode();
        }
        if (getClave() != null) {
            _hashCode += getClave().hashCode();
        }
        if (getComparable() != null) {
            _hashCode += getComparable().hashCode();
        }
        if (getContrasena() != null) {
            _hashCode += getContrasena().hashCode();
        }
        if (getCorreo() != null) {
            _hashCode += getCorreo().hashCode();
        }
        if (getEstacion() != null) {
            _hashCode += getEstacion().hashCode();
        }
        _hashCode += getId();
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Informacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "Informacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chofer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "chofer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "Chofer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "clave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comparable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "comparable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrasena");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "contrasena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "correo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "estacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "Estacion"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
