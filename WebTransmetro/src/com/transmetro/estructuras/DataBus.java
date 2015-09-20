/**
 * DataBus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.transmetro.estructuras;

public class DataBus  implements java.io.Serializable {
    private java.lang.String estacion;

    private java.lang.String fecha;

    private java.lang.String idBus;

    private java.lang.String tiempoLlegada;

    private java.lang.String tiempoSalida;

    public DataBus() {
    }

    public DataBus(
           java.lang.String estacion,
           java.lang.String fecha,
           java.lang.String idBus,
           java.lang.String tiempoLlegada,
           java.lang.String tiempoSalida) {
           this.estacion = estacion;
           this.fecha = fecha;
           this.idBus = idBus;
           this.tiempoLlegada = tiempoLlegada;
           this.tiempoSalida = tiempoSalida;
    }


    /**
     * Gets the estacion value for this DataBus.
     * 
     * @return estacion
     */
    public java.lang.String getEstacion() {
        return estacion;
    }


    /**
     * Sets the estacion value for this DataBus.
     * 
     * @param estacion
     */
    public void setEstacion(java.lang.String estacion) {
        this.estacion = estacion;
    }


    /**
     * Gets the fecha value for this DataBus.
     * 
     * @return fecha
     */
    public java.lang.String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this DataBus.
     * 
     * @param fecha
     */
    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the idBus value for this DataBus.
     * 
     * @return idBus
     */
    public java.lang.String getIdBus() {
        return idBus;
    }


    /**
     * Sets the idBus value for this DataBus.
     * 
     * @param idBus
     */
    public void setIdBus(java.lang.String idBus) {
        this.idBus = idBus;
    }


    /**
     * Gets the tiempoLlegada value for this DataBus.
     * 
     * @return tiempoLlegada
     */
    public java.lang.String getTiempoLlegada() {
        return tiempoLlegada;
    }


    /**
     * Sets the tiempoLlegada value for this DataBus.
     * 
     * @param tiempoLlegada
     */
    public void setTiempoLlegada(java.lang.String tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }


    /**
     * Gets the tiempoSalida value for this DataBus.
     * 
     * @return tiempoSalida
     */
    public java.lang.String getTiempoSalida() {
        return tiempoSalida;
    }


    /**
     * Sets the tiempoSalida value for this DataBus.
     * 
     * @param tiempoSalida
     */
    public void setTiempoSalida(java.lang.String tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataBus)) return false;
        DataBus other = (DataBus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estacion==null && other.getEstacion()==null) || 
             (this.estacion!=null &&
              this.estacion.equals(other.getEstacion()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.idBus==null && other.getIdBus()==null) || 
             (this.idBus!=null &&
              this.idBus.equals(other.getIdBus()))) &&
            ((this.tiempoLlegada==null && other.getTiempoLlegada()==null) || 
             (this.tiempoLlegada!=null &&
              this.tiempoLlegada.equals(other.getTiempoLlegada()))) &&
            ((this.tiempoSalida==null && other.getTiempoSalida()==null) || 
             (this.tiempoSalida!=null &&
              this.tiempoSalida.equals(other.getTiempoSalida())));
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
        if (getEstacion() != null) {
            _hashCode += getEstacion().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getIdBus() != null) {
            _hashCode += getIdBus().hashCode();
        }
        if (getTiempoLlegada() != null) {
            _hashCode += getTiempoLlegada().hashCode();
        }
        if (getTiempoSalida() != null) {
            _hashCode += getTiempoSalida().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataBus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "DataBus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "estacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "idBus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiempoLlegada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "tiempoLlegada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiempoSalida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://estructuras.transmetro.com", "tiempoSalida"));
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
