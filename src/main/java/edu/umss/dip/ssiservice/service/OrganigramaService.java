/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;


import edu.umss.dip.ssiservice.model.Organigrama;

import java.util.List;

public interface OrganigramaService extends GenericService<Organigrama> {
//    void saveImage(Long id, InputStream inputStream);
     List<Organigrama> findBy(String cargo);
}

    