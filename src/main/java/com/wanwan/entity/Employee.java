package com.wanwan.entity;

import java.util.Date;

/**
 * @Author: Wanwan Jiang
 * @Description:
 * @Date: Created in 10:38 2017/9/29
 * @Modified By:
 * @Email: jiangwanwan0327@163.com
 */
public class Employee {
    private int empId;
    private String empName;
    private Date workDate;

    public Employee() {
    }

    public Employee(int empId, String empName, Date workDate) {
        this.empId = empId;
        this.empName = empName;
        this.workDate = workDate;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", workDate=" + workDate +
                '}';
    }
}
