/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.dto;


import edu.umss.dip.ssiservice.model.Project;

public class ProjectDto extends DtoBase<Project> {
    private String name;
    private String city;
    private String province;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
