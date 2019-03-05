/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;


import edu.umss.dip.ssiservice.model.Organigrama;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.OrganigramaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganigramaServiceImpl extends GenericServiceImpl<Organigrama> implements OrganigramaService {
    private final OrganigramaRepository repository;

    public OrganigramaServiceImpl(OrganigramaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Organigrama> getRepository() {
        return repository;
    }

    @Override
    public List<Organigrama> findBy(String password) {
        return null;
    }
}
