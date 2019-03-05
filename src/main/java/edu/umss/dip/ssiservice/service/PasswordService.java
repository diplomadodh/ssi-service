/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Password;

import java.util.List;

public interface PasswordService extends GenericService<Password> {
     List<Password> findBy(String password);
}

    