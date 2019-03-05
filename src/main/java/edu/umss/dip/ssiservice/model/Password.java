/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Password extends ModelBase {

    private Integer idLogin;
    private String passEncript;

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public String getPassEncript() {
        return passEncript;
    }

    public void setPassEncript(String passEncript) {
        this.passEncript = passEncript;
    }

}
