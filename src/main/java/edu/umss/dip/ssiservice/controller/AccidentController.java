/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.AccidentDto;
import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.service.AccidentService;
import edu.umss.dip.ssiservice.service.GenericService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/accidents")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class AccidentController extends GenericController<Accident, AccidentDto> {
    private AccidentService service;


    public AccidentController(AccidentService service) {
        this.service = service;
    }

    @Override
    public GenericService getService() {
        return service;
    }

    /*
    public AccidentController(AccidentService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<AccidentDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }
*/
    @GET
    public List<Accident> getAccident(@QueryParam(value = "accident") String accident) {
        return StringUtils.isEmpty(accident) ? service.findAll() : service.findBy(accident);
    }


/*
    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */
}
