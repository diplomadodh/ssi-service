/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;

@Entity
public class Organigrama extends ModelBase {
    private Integer cargo;
    private Integer antecesor;
    private Integer sucesor;

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    public Integer getAntecesor() {
        return antecesor;
    }

    public void setAntecesor(Integer antecesor) {
        this.antecesor = antecesor;
    }

    public Integer getSucesor() {
        return sucesor;
    }

    public void setSucesor(Integer sucesor) {
        this.sucesor = sucesor;
    }
}
