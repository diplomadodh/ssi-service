/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accident;

import java.util.List;

public interface AccidentService extends GenericService<Accident> {
//    void saveImage(Long id, InputStream inputStream);
     List<Accident> findBy(String employee);
}

    