/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;


import edu.umss.dip.ssiservice.model.Project;
import edu.umss.dip.ssiservice.repositories.ProjectRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends GenericServiceImpl<Project> implements ProjectService {
    private final ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Project> getRepository() {
        return repository;
    }

    @Override
    public List<Project> findBy(String project) {
        return null;
    }
}
