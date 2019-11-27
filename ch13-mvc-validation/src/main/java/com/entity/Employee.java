package com.entity;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class Employee {

    private Integer id;
//    @Digits(integer = 3,fraction = 2,message = "整数必须是3位，小数是两位")
    @NotNull(message = "工资不能为空")
    private Double salary;
//    @Past
    @NotNull(message = "日期不能为空")
    private String hiredate;
    @NotNull(message = "性别不能为空")
    private Integer gender;
    @Size(min = 2,max = 4,message = "长度要有2-4位")
    private String username;
    private Integer deptid;

    public Employee() {
    }

    public Employee(Integer id, Double salary, String hiredate, Integer gender, String username, Integer deptid) {
        this.id = id;
        this.salary = salary;
        this.hiredate = hiredate;
        this.gender = gender;
        this.username = username;
        this.deptid = deptid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", deptid=" + deptid +
                '}';
    }
}
