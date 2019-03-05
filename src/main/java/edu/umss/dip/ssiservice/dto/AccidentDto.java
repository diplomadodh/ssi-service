/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Accident;
//import edu.umss.dip.ssiservice.model.Accident;
import edu.umss.dip.ssiservice.model.Employee;

import java.util.Date;


public class AccidentDto extends DtoBase<Accident> {
    private Employee employee;
    private Date date;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
