/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.model.Password;

import java.util.Date;



public class PasswordDto extends DtoBase<Password> {
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
