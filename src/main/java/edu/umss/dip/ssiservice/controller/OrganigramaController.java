/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.OrganigramaDto;
import edu.umss.dip.ssiservice.model.Organigrama;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.OrganigramaService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/organigramas")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class OrganigramaController extends GenericController<Organigrama, OrganigramaDto> {
    private OrganigramaService service;


    public OrganigramaController(OrganigramaService service) {
        this.service = service;
    }

    @Override
    public GenericService getService() {
        return service;
    }

    @GET
    public List<Organigrama> getOrganigrama(@QueryParam(value = "organigrama") String organigrama) {
        return StringUtils.isEmpty(organigrama) ? service.findAll() : service.findBy(organigrama);
    }


/*
    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */
}
