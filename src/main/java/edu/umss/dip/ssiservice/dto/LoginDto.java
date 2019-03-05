/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.dto;


import edu.umss.dip.ssiservice.model.Login;
import edu.umss.dip.ssiservice.model.Password;

import javax.persistence.OneToMany;



public class LoginDto extends DtoBase<Login> {
    private Integer idPersona;
    private String user;
    private boolean state;
    //@OneToMany//(optional = false)
   // private Password password;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

//    public Password getPassword() {
//        return password;
//    }
//
//    public void setPassword(Password password) {
//        this.password = password;
//    }
}
