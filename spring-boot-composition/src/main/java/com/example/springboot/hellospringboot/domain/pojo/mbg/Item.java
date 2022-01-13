package com.example.springboot.hellospringboot.domain.pojo.mbg;

import java.io.Serializable;

public class Item implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.id
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.item_no
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private String itemNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table items
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.id
     *
     * @return the value of items.id
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Item withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.id
     *
     * @param id the value for items.id
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.item_no
     *
     * @return the value of items.item_no
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public Item withItemNo(String itemNo) {
        this.setItemNo(itemNo);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.item_no
     *
     * @param itemNo the value for items.item_no
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemNo=").append(itemNo);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
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
        Item other = (Item) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItemNo() == null ? other.getItemNo() == null : this.getItemNo().equals(other.getItemNo()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Mon Oct 11 17:27:33 CST 2021
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItemNo() == null) ? 0 : getItemNo().hashCode());
        return result;
    }
}