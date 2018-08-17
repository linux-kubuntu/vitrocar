package model;
// Generated 17/08/2018 01:32:34 AM by Hibernate Tools 4.3.1



/**
 * DetSiniestroId generated by hbm2java
 */
public class DetSiniestroId  implements java.io.Serializable {


     private int cns;
     private int idSiniestro;

    public DetSiniestroId() {
    }

    public DetSiniestroId(int cns, int idSiniestro) {
       this.cns = cns;
       this.idSiniestro = idSiniestro;
    }
   
    public int getCns() {
        return this.cns;
    }
    
    public void setCns(int cns) {
        this.cns = cns;
    }
    public int getIdSiniestro() {
        return this.idSiniestro;
    }
    
    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetSiniestroId) ) return false;
		 DetSiniestroId castOther = ( DetSiniestroId ) other; 
         
		 return (this.getCns()==castOther.getCns())
 && (this.getIdSiniestro()==castOther.getIdSiniestro());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCns();
         result = 37 * result + this.getIdSiniestro();
         return result;
   }   


}


