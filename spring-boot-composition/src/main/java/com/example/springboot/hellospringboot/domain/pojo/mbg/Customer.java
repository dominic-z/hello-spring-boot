package com.example.springboot.hellospringboot.domain.pojo.mbg;

import java.io.Serializable;
import java.math.BigDecimal;

public class Customer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.customerNumber
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private Integer customerNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.customerName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String customerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.contactLastName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String contactLastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.contactFirstName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String contactFirstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.phone
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.addressLine1
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String addressLine1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.addressLine2
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String addressLine2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.city
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.state
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.postalCode
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String postalCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.country
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.salesRepEmployeeNumber
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private Integer salesRepEmployeeNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.creditLimit
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private BigDecimal creditLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.customerNumber
     *
     * @return the value of customers.customerNumber
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withCustomerNumber(Integer customerNumber) {
        this.setCustomerNumber(customerNumber);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.customerNumber
     *
     * @param customerNumber the value for customers.customerNumber
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.customerName
     *
     * @return the value of customers.customerName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withCustomerName(String customerName) {
        this.setCustomerName(customerName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.customerName
     *
     * @param customerName the value for customers.customerName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.contactLastName
     *
     * @return the value of customers.contactLastName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withContactLastName(String contactLastName) {
        this.setContactLastName(contactLastName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.contactLastName
     *
     * @param contactLastName the value for customers.contactLastName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.contactFirstName
     *
     * @return the value of customers.contactFirstName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withContactFirstName(String contactFirstName) {
        this.setContactFirstName(contactFirstName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.contactFirstName
     *
     * @param contactFirstName the value for customers.contactFirstName
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.phone
     *
     * @return the value of customers.phone
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.phone
     *
     * @param phone the value for customers.phone
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.addressLine1
     *
     * @return the value of customers.addressLine1
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withAddressLine1(String addressLine1) {
        this.setAddressLine1(addressLine1);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.addressLine1
     *
     * @param addressLine1 the value for customers.addressLine1
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.addressLine2
     *
     * @return the value of customers.addressLine2
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withAddressLine2(String addressLine2) {
        this.setAddressLine2(addressLine2);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.addressLine2
     *
     * @param addressLine2 the value for customers.addressLine2
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.city
     *
     * @return the value of customers.city
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withCity(String city) {
        this.setCity(city);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.city
     *
     * @param city the value for customers.city
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.state
     *
     * @return the value of customers.state
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withState(String state) {
        this.setState(state);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.state
     *
     * @param state the value for customers.state
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.postalCode
     *
     * @return the value of customers.postalCode
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withPostalCode(String postalCode) {
        this.setPostalCode(postalCode);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.postalCode
     *
     * @param postalCode the value for customers.postalCode
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.country
     *
     * @return the value of customers.country
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withCountry(String country) {
        this.setCountry(country);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.country
     *
     * @param country the value for customers.country
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.salesRepEmployeeNumber
     *
     * @return the value of customers.salesRepEmployeeNumber
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Integer getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
        this.setSalesRepEmployeeNumber(salesRepEmployeeNumber);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.salesRepEmployeeNumber
     *
     * @param salesRepEmployeeNumber the value for customers.salesRepEmployeeNumber
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.creditLimit
     *
     * @return the value of customers.creditLimit
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Customer withCreditLimit(BigDecimal creditLimit) {
        this.setCreditLimit(creditLimit);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.creditLimit
     *
     * @param creditLimit the value for customers.creditLimit
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerNumber=").append(customerNumber);
        sb.append(", customerName=").append(customerName);
        sb.append(", contactLastName=").append(contactLastName);
        sb.append(", contactFirstName=").append(contactFirstName);
        sb.append(", phone=").append(phone);
        sb.append(", addressLine1=").append(addressLine1);
        sb.append(", addressLine2=").append(addressLine2);
        sb.append(", city=").append(city);
        sb.append(", state=").append(state);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", country=").append(country);
        sb.append(", salesRepEmployeeNumber=").append(salesRepEmployeeNumber);
        sb.append(", creditLimit=").append(creditLimit);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getCustomerNumber() == null ? other.getCustomerNumber() == null : this.getCustomerNumber().equals(other.getCustomerNumber()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getContactLastName() == null ? other.getContactLastName() == null : this.getContactLastName().equals(other.getContactLastName()))
            && (this.getContactFirstName() == null ? other.getContactFirstName() == null : this.getContactFirstName().equals(other.getContactFirstName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddressLine1() == null ? other.getAddressLine1() == null : this.getAddressLine1().equals(other.getAddressLine1()))
            && (this.getAddressLine2() == null ? other.getAddressLine2() == null : this.getAddressLine2().equals(other.getAddressLine2()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getPostalCode() == null ? other.getPostalCode() == null : this.getPostalCode().equals(other.getPostalCode()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getSalesRepEmployeeNumber() == null ? other.getSalesRepEmployeeNumber() == null : this.getSalesRepEmployeeNumber().equals(other.getSalesRepEmployeeNumber()))
            && (this.getCreditLimit() == null ? other.getCreditLimit() == null : this.getCreditLimit().equals(other.getCreditLimit()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerNumber() == null) ? 0 : getCustomerNumber().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getContactLastName() == null) ? 0 : getContactLastName().hashCode());
        result = prime * result + ((getContactFirstName() == null) ? 0 : getContactFirstName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddressLine1() == null) ? 0 : getAddressLine1().hashCode());
        result = prime * result + ((getAddressLine2() == null) ? 0 : getAddressLine2().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getSalesRepEmployeeNumber() == null) ? 0 : getSalesRepEmployeeNumber().hashCode());
        result = prime * result + ((getCreditLimit() == null) ? 0 : getCreditLimit().hashCode());
        return result;
    }
}