/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.LoginDto;
import edu.umss.dip.ssiservice.model.Login;
import edu.umss.dip.ssiservice.service.LoginService;
import edu.umss.dip.ssiservice.service.GenericService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Logins")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class LoginController extends GenericController<Login, LoginDto> {
    private LoginService service;


    public LoginController(LoginService service) {
        this.service = service;
    }

    @Override
    public GenericService getService() {
        return service;
    }


    @GET
    public List<Login> getLogin(@QueryParam(value = "login") String login) {
        return StringUtils.isEmpty(login) ? service.findAll() : service.findBy(login);
    }


/*
    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */
}
