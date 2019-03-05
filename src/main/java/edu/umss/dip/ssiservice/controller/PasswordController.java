/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.PasswordDto;
import edu.umss.dip.ssiservice.model.Password;
import edu.umss.dip.ssiservice.service.PasswordService;
import edu.umss.dip.ssiservice.service.GenericService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/passwords")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class PasswordController extends GenericController<Password, PasswordDto> {
    private PasswordService service;


    public PasswordController(PasswordService service) {
        this.service = service;
    }

    @Override
    public GenericService getService() {
        return service;
    }
    
    @GET
    public List<Password> getPassword(@QueryParam(value = "password") String password) {
        return StringUtils.isEmpty(password) ? service.findAll() : service.findBy(password);
    }


/*
    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */
}
