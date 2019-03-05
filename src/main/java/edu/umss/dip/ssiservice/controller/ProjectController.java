/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.ProjectDto;
import edu.umss.dip.ssiservice.model.Project;
import edu.umss.dip.ssiservice.service.ProjectService;
import edu.umss.dip.ssiservice.service.GenericService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/projects")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class ProjectController extends GenericController<Project, ProjectDto> {
    private ProjectService service;


    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @Override
    public GenericService getService() {
        return service;
    }

    @GET
    public List<Project> getProject(@QueryParam(value = "project") String project) {
        return StringUtils.isEmpty(project) ? service.findAll() : service.findBy(project);
    }


/*
    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */
}
