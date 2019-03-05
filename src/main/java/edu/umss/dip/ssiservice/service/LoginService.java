/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;


import edu.umss.dip.ssiservice.model.Login;

import java.util.List;

public interface LoginService extends GenericService<Login> {
//    void saveImage(Long id, InputStream inputStream);
     List<Login> findBy(String user);
}

    