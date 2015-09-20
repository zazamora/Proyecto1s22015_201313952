/**
 * Estacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.estructuras;

public class Estacion  implements java.io.Serializable {
    private java.lang.String horaLlegada;

    private java.lang.String id;

    private java.lang.String nombre;

    private boolean nuevo;

    private java.lang.String pass;

    private int pcargadas;

    private int personas;

    private int psistema;

    private java.lang.String tipo;

    public Estacion() {
    }

    public Estacion(
           java.lang.String horaLlegada,
           java.lang.String id,
           java.lang.String nombre,
           boolean nuevo,
           java.lang.String pass,
           int pcargadas,
           int personas,
           int psistema,
           java.lang.String tipo) {
           this.horaLlegada = horaLlegada;
           this.id = id;
           this.nombre = nombre;
           this.nuevo = nuevo;
           this.pass = pass;
           this.pcargadas = pcargadas;
           this.personas = personas;
           this.psistema = psistema;
           this.tipo = tipo;
    }


    /**
     * Gets the horaLlegada value for this Estacion.
     * 
     * @return horaLlegada
     */
    public java.lang.String getHoraLlegada() {
        return horaLlegada;
    }


    /**
     * Sets the horaLlegada value for this Estacion.
     * 
     * @param horaLlegada
     */
    public void setHoraLlegada(java.lang.String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }


    /**
     * Gets the id value for this Estacion.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Estacion.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the nombre value for this Estacion.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Estacion.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the nuevo value for this Estacion.
     * 
     * @return nuevo
     */
    public boolean isNuevo() {
        return nuevo;
    }


    /**
     * Sets the nuevo value for this Estacion.
     * 
     * @param nuevo
     */
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }


    /**
     * Gets the pass value for this Estacion.
     * 
     * @return pass
     */
    public java.lang.String getPass() {
        return pass;
    }


    /**
     * Sets the pass value for this Estacion.
     * 
     * @param pass
     */
    public void setPass(java.lang.String pass) {
        this.pass = pass;
    }


    /**
     * Gets the pcargadas value for this Estacion.
     * 
     * @return pcargadas
     */
    public int getPcargadas() {
        return pcargadas;
    }


    /**
     * Sets the pcargadas value for this Estacion.
     * 
     * @param pcargadas
     */
    public void setPcargadas(int pcargadas) {
        this.pcargadas = pcargadas;
    }


    /**
     * Gets the personas value for this Estacion.
     * 
     * @return personas
     */
    public int getPersonas() {
        return personas;
    }


    /**
     * Sets the personas value for this Estacion.
     * 
     * @param personas
     */
    public void setPersonas(int personas) {
        this.personas = personas;
    }


    /**
     * Gets the psistema value for this Estacion.
     * 
     * @return psistema
     */
    public int getPsistema() {
        return psistema;
    }


    /**
     * Sets the psistema value for this Estacion.
     * 
     * @param psistema
     */
    public void setPsistema(int psistema) {
        this.psistema = psistema;
    }


    /**
     * Gets the tipo value for this Estacion.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Estacion.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Estacion)) return false;
        Estacion other = (Estacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.horaLlegada==null && other.getHoraLlegada()==null) || 
             (this.horaLlegada!=null &&
              this.horaLlegada.equals(other.getHoraLlegada()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            this.nuevo == other.isNuevo() &&
            ((this.pass==null && other.getPass()==null) || 
             (this.pass!=null &&
              this.pass.equals(other.getPass()))) &&
            this.pcargadas == other.getPcargadas() &&
            this.personas == other.getPersonas() &&
            this.psistema == other.getPsistema() &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo())));
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
        if (getHoraLlegada() != null) {
            _hashCode += getHoraLlegada().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        _hashCode += (isNuevo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPass() != null) {
            _hashCode += getPass().hashCode();
        }
        _hashCode += getPcargadas();
        _hashCode += getPersonas();
        _hashCode += getPsistema();
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Estacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "Estacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaLlegada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "horaLlegada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nuevo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "nuevo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "pass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcargadas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "pcargadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "personas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psistema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "psistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "tipo"));
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
