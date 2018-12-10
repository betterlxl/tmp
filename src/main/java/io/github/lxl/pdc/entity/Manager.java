package io.github.lxl.pdc.entity;

/**
 * @Description: Manager实体
 * @Author: lxl
 * @CreateDate: 2018/12/10 14:55
 * @UpdateUser: lxl
 * @UpdateDate: 2018/12/10 14:55
 * @UpdateRemark:
 * @Version: 1.0
 */
public class Manager  {
    private int id;
    private String name;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", userName='" + name  +
                ", passWord='" + phone +
                '}';


    }
}
