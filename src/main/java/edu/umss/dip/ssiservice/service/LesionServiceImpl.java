/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;


import edu.umss.dip.ssiservice.model.Lesion;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.LesionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LesionServiceImpl extends GenericServiceImpl<Lesion> implements LesionService {
    private final LesionRepository repository;

    public LesionServiceImpl(LesionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Lesion> getRepository() {
        return repository;
    }

    @Override
    public List<Lesion> findBy(String password) {
        return null;
    }
}
