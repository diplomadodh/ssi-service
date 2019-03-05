/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;


import edu.umss.dip.ssiservice.model.Password;
import edu.umss.dip.ssiservice.repositories.PasswordRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordServiceImpl extends GenericServiceImpl<Password> implements PasswordService {
    private final PasswordRepository repository;

    public PasswordServiceImpl(PasswordRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Password> getRepository() {
        return repository;
    }

    @Override
    public List<Password> findBy(String password) {
        return null;
    }
}
