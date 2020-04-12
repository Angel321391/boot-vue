package com.uchung.departmentappraise.model;

import java.math.BigDecimal;
import java.util.Date;

public class Personnel {
    private Integer id;
    private String name;
    private Date birthday;
    private Integer sex;
    private String tel;
    private String address;
    private Boolean status;
    private Boolean is_delete;
    private Date join_date;
    private Date create_date;
    private Date update_date;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIs_delete() {
        return is_delete;
    }
    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Date getJoin_date() {
        return join_date;
    }
    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public Date getCreate_date() {
        return create_date;
    }
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }
    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
}