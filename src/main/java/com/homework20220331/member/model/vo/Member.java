package com.homework20220331.member.model.vo;

import java.sql.Date;
import java.sql.Timestamp;

public class Member {

    private String id;
    private String name;
    private String gender;
    private Date birthday;
    private String email;
    private String address;
    private Timestamp regDate;

    public Member() {
        super();
    }

    public Member(String id, String name, String gender, Date birthday, String email, String address,
                  Timestamp regDate) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.regDate = regDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday="
                + birthday + ", email=" + email + ", address=" + address + ", regDate=" + regDate + "]";
    }
}
