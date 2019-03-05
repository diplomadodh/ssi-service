/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Lesion;

import java.util.List;

public interface LesionService extends GenericService<Lesion> {
//    void saveImage(Long id, InputStream inputStream);
     List<Lesion> findBy(String name);
}

    