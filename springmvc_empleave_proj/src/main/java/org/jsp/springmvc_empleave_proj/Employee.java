package org.jsp.springmvc_empleave_proj;

public class Employee {
    private int empId;
    private String password;
    private String empLeave;
    private String empStartDate;
    private String empEndDate;
    private String empReason;             

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmpLeave() {
        return empLeave;
    }

    public void setEmpLeave(String empLeave) {
        this.empLeave = empLeave;
    }

    public String getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(String empStartDate) {
        this.empStartDate = empStartDate;
    }

    public String getEmpEndDate() {
        return empEndDate;
    }

    public void setEmpEndDate(String empEndDate) {
        this.empEndDate = empEndDate;
    }

    public String getEmpReason() {
        return empReason;
    }

    public void setEmpReason(String empReason) {
        this.empReason = empReason;
    }
}
