/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;


import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.repositories.AccidentRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccidentServiceImpl extends GenericServiceImpl<Accident> implements AccidentService {
    private final AccidentRepository repository;

    public AccidentServiceImpl(AccidentRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Accident> getRepository() {
        return repository;
    }

    @Override
    public List<Accident> findBy(String accident) {
        return null;
    }
}
