/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author test blah blah blah blah blah blah
 */
public class Student {

    private int ID; 
    private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    
        private String PartTime;

    /**
     * Get the value of PartTime
     *
     * @return the value of PartTime
     */
    public String getPartTime() {
        return PartTime;
    }

    /**
     * Set the value of PartTime
     *
     * @param PartTime new value of PartTime
     */
    public void setPartTime(String PartTime) {
        this.PartTime = PartTime;
    }

    private String Phone;
    
    

    /**
     * Get the value of Phone
     *
     * @return the value of Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * Set the value of Phone
     *
     * @param Phone new value of Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }


    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    /**
     * Set the value of ID
     *
     * @param ID new value of ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
   

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
