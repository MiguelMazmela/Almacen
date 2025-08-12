/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Miguel
 */
public class vari {
    
    
    

    public class bb {
        
        private String Base_de_datos="Base.bd";
        private String Camino_base_de__datos;

        private int IT;
        private String SKU;
        private String SERIE;
        private String ARTICULO;
        private String LINEA;
        private String SUBLINEA;
        private String MARCA;
        private String ESTADO;
        private String SUBINVENTARIO;
        private Double COSTO;
        private String PROPIETARIO;
        private String CONDICION_COMPRA;
        private String TIPO_LMACEN;
        private short DIAS_ANTIGUEDAD = 0;
        private short CANTIDAD;
        private String Cabecera[] = {"IT", "SKU", "SERIE", "ARTICULO", "LINEA", "SUBLINEA", "MARCA",
            "ESTADO", "SUBINVENTARIO", "COSTO", "PROPIETARIO", "CONDICION", "COMPRA",
            "TIPO", "ALMACEN", "DIAS", "ANTIGUEDAD", "CANTIDAD"};

        public int getIT() {
            return IT;
        }

        public void setIT(int IT) {
            this.IT = IT;
        }

        public String getSKU() {
            return SKU;
        }

        public void setSKU(String SKU) {
            this.SKU = SKU;
        }

        public String getSERIE() {
            return SERIE;
        }

        public void setSERIE(String SERIE) {
            this.SERIE = SERIE;
        }

        public String getARTICULO() {
            return ARTICULO;
        }

        public void setARTICULO(String ARTICULO) {
            this.ARTICULO = ARTICULO;
        }

        public String getLINEA() {
            return LINEA;
        }

        public void setLINEA(String LINEA) {
            this.LINEA = LINEA;
        }

        public String getSUBLINEA() {
            return SUBLINEA;
        }

        public void setSUBLINEA(String SUBLINEA) {
            this.SUBLINEA = SUBLINEA;
        }

        public String getMARCA() {
            return MARCA;
        }

        public void setMARCA(String MARCA) {
            this.MARCA = MARCA;
        }

        public String getESTADO() {
            return ESTADO;
        }

        public void setESTADO(String ESTADO) {
            this.ESTADO = ESTADO;
        }

        public String getSUBINVENTARIO() {
            return SUBINVENTARIO;
        }

        public void setSUBINVENTARIO(String SUBINVENTARIO) {
            this.SUBINVENTARIO = SUBINVENTARIO;
        }

        public Double getCOSTO() {
            return COSTO;
        }

        public void setCOSTO(Double COSTO) {
            this.COSTO = COSTO;
        }

        public String getPROPIETARIO() {
            return PROPIETARIO;
        }

        public void setPROPIETARIO(String PROPIETARIO) {
            this.PROPIETARIO = PROPIETARIO;
        }

        public String getCONDICION_COMPRA() {
            return CONDICION_COMPRA;
        }

        public void setCONDICION_COMPRA(String CONDICION_COMPRA) {
            this.CONDICION_COMPRA = CONDICION_COMPRA;
        }

        public String getTIPO_LMACEN() {
            return TIPO_LMACEN;
        }

        public void setTIPO_LMACEN(String TIPO_LMACEN) {
            this.TIPO_LMACEN = TIPO_LMACEN;
        }

        public short getDIAS_ANTIGUEDAD() {
            return DIAS_ANTIGUEDAD;
        }

        public void setDIAS_ANTIGUEDAD(short DIAS_ANTIGUEDAD) {
            this.DIAS_ANTIGUEDAD = DIAS_ANTIGUEDAD;
        }

        public short getCANTIDAD() {
            return CANTIDAD;
        }

        public void setCANTIDAD(short CANTIDAD) {
            this.CANTIDAD = CANTIDAD;
        }

        public String[] getCabecera() {
            return Cabecera;
        }

        public void setCabecera(String[] Cabecera) {
            this.Cabecera = Cabecera;
        }

        public String getBase_de_datos() {
            return Base_de_datos;
        }

        public void setBase_de_datos(String Base_de_datos) {
            this.Base_de_datos = Base_de_datos;
        }

        public String getCamino_base_de__datos() {
            return Camino_base_de__datos;
        }

        public void setCamino_base_de__datos(String Camino_base_de__datos) {
            this.Camino_base_de__datos = Camino_base_de__datos;
        }

 

    }

}
