/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;



import edu.umss.dip.ssiservice.model.Login;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.LoginRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl extends GenericServiceImpl<Login> implements LoginService {
    private final LoginRepository repository;

    public LoginServiceImpl(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Login> getRepository() {
        return repository;
    }

    @Override
    public List<Login> findBy(String login) {
        return null;
    }
}
