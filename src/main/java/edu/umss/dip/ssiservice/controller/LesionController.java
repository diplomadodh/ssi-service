/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.LesionDto;
import edu.umss.dip.ssiservice.model.Lesion;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.LesionService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/lesions")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class LesionController extends GenericController<Lesion, LesionDto> {
    private LesionService service;


    public LesionController(LesionService service) {
        this.service = service;
    }

    @Override
    public GenericService getService() {
        return service;
    }

    @GET
    public List<Lesion> getLesion(@QueryParam(value = "lesion") String lesion) {
        return StringUtils.isEmpty(lesion) ? service.findAll() : service.findBy(lesion);
    }


/*
    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */
}
