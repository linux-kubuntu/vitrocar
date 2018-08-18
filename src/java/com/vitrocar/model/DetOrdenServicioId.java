package com.vitrocar.model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1



/**
 * DetOrdenServicioId generated by hbm2java
 */
public class DetOrdenServicioId  implements java.io.Serializable {


     private int cns;
     private String folio;

    public DetOrdenServicioId() {
    }

    public DetOrdenServicioId(int cns, String folio) {
       this.cns = cns;
       this.folio = folio;
    }
   
    public int getCns() {
        return this.cns;
    }
    
    public void setCns(int cns) {
        this.cns = cns;
    }
    public String getFolio() {
        return this.folio;
    }
    
    public void setFolio(String folio) {
        this.folio = folio;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetOrdenServicioId) ) return false;
		 DetOrdenServicioId castOther = ( DetOrdenServicioId ) other; 
         
		 return (this.getCns()==castOther.getCns())
 && ( (this.getFolio()==castOther.getFolio()) || ( this.getFolio()!=null && castOther.getFolio()!=null && this.getFolio().equals(castOther.getFolio()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCns();
         result = 37 * result + ( getFolio() == null ? 0 : this.getFolio().hashCode() );
         return result;
   }   


}


