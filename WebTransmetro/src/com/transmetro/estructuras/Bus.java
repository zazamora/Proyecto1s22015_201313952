/**
 * Bus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.estructuras;

public class Bus  implements java.io.Serializable {
    private int claveChofer;

    private java.lang.String fecha;

    private java.lang.String horarioFin;

    private java.lang.String horarioInicio;

    private java.lang.String id;

    private java.lang.String ruta;

    public Bus() {
    }

    public Bus(
           int claveChofer,
           java.lang.String fecha,
           java.lang.String horarioFin,
           java.lang.String horarioInicio,
           java.lang.String id,
           java.lang.String ruta) {
           this.claveChofer = claveChofer;
           this.fecha = fecha;
           this.horarioFin = horarioFin;
           this.horarioInicio = horarioInicio;
           this.id = id;
           this.ruta = ruta;
    }


    /**
     * Gets the claveChofer value for this Bus.
     * 
     * @return claveChofer
     */
    public int getClaveChofer() {
        return claveChofer;
    }


    /**
     * Sets the claveChofer value for this Bus.
     * 
     * @param claveChofer
     */
    public void setClaveChofer(int claveChofer) {
        this.claveChofer = claveChofer;
    }


    /**
     * Gets the fecha value for this Bus.
     * 
     * @return fecha
     */
    public java.lang.String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Bus.
     * 
     * @param fecha
     */
    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the horarioFin value for this Bus.
     * 
     * @return horarioFin
     */
    public java.lang.String getHorarioFin() {
        return horarioFin;
    }


    /**
     * Sets the horarioFin value for this Bus.
     * 
     * @param horarioFin
     */
    public void setHorarioFin(java.lang.String horarioFin) {
        this.horarioFin = horarioFin;
    }


    /**
     * Gets the horarioInicio value for this Bus.
     * 
     * @return horarioInicio
     */
    public java.lang.String getHorarioInicio() {
        return horarioInicio;
    }


    /**
     * Sets the horarioInicio value for this Bus.
     * 
     * @param horarioInicio
     */
    public void setHorarioInicio(java.lang.String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }


    /**
     * Gets the id value for this Bus.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Bus.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the ruta value for this Bus.
     * 
     * @return ruta
     */
    public java.lang.String getRuta() {
        return ruta;
    }


    /**
     * Sets the ruta value for this Bus.
     * 
     * @param ruta
     */
    public void setRuta(java.lang.String ruta) {
        this.ruta = ruta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bus)) return false;
        Bus other = (Bus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.claveChofer == other.getClaveChofer() &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.horarioFin==null && other.getHorarioFin()==null) || 
             (this.horarioFin!=null &&
              this.horarioFin.equals(other.getHorarioFin()))) &&
            ((this.horarioInicio==null && other.getHorarioInicio()==null) || 
             (this.horarioInicio!=null &&
              this.horarioInicio.equals(other.getHorarioInicio()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ruta==null && other.getRuta()==null) || 
             (this.ruta!=null &&
              this.ruta.equals(other.getRuta())));
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
        _hashCode += getClaveChofer();
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getHorarioFin() != null) {
            _hashCode += getHorarioFin().hashCode();
        }
        if (getHorarioInicio() != null) {
            _hashCode += getHorarioInicio().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRuta() != null) {
            _hashCode += getRuta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "Bus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveChofer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "claveChofer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "horarioFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "horarioInicio"));
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
        elemField.setFieldName("ruta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "ruta"));
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
