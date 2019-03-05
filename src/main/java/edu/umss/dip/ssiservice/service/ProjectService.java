/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.model.Project;

import java.util.List;

public interface ProjectService extends GenericService<Project> {
//    void saveImage(Long id, InputStream inputStream);
     List<Project> findBy(String name);
}

    