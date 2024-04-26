package pkg251_project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yara
 */
import java.util.Date; 
public class Driver {
    private String driverID;
    private String phoneNum;
    private int salary;
    private Date birthDate;

    /**
     *
     * @param driverID
     * @param phoneNum
     * @param salary
     * @param birthDate
     */
    public Driver(String driverID, String phoneNum, int salary, Date birthDate) {
        this.driverID = driverID;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    // toString method
    @Override
    public String toString() {
        return "Driver{" +
               "driverID='" + driverID + '\'' +
               ", phoneNum='" + phoneNum + '\'' +
               ", salary=" + salary +
               ", birthDate=" + birthDate +
               '}';
    }
}
