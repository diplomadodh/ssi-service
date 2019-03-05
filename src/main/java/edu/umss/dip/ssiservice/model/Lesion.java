/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Lesion extends ModelBase {
    private Integer incidente;
    private String nombreLesion;
    private String areaAfectada;

    public Integer getIncidente() {
        return incidente;
    }

    public void setIncidente(Integer incidente) {
        this.incidente = incidente;
    }

    public String getNombreLesion() {
        return nombreLesion;
    }

    public void setNombreLesion(String nombreLesion) {
        this.nombreLesion = nombreLesion;
    }

    public String getAreaAfectada() {
        return areaAfectada;
    }

    public void setAreaAfectada(String areaAfectada) {
        this.areaAfectada = areaAfectada;
    }
}
