package io.github.lxl.pdc.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "product")
public class Product {
    /**
     * 产品id
     */
    private int id ;
    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;
    /**
     * 产品品类ids
     */
    private int categoryId ;
    /**
     * 创建人id
     */
    private  int creatorId;
    /**
     * 最后更新人id
     */
    private int lastUpdatorId;
    /**
     * 产品品类名称
     */
    private String categoryName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 产品
     */
    private String productModel;
    /**
     * 产品类型
     */
    private int productType;
    /**
     * 协议类型
     */
    private int protocolType;

    /**
     *
     * @return
     */
    private  int noteType;


    private int contactType;
    /**
     * 备注
     */
    private String desc;

    /**
     *
     * @return
     */
    private String productImage;

    private boolean delete;

    /*public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public int getNoteType() {
        return noteType;
    }

    public void setNoteType(int noteType) {
        this.noteType = noteType;
    }

    public int getContactType() {
        return contactType;
    }

    public void setContactType(int contactType) {
        this.contactType = contactType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public int getLastUpdatorId() {
        return lastUpdatorId;
    }

    public void setLastUpdatorId(int lastUpdatorId) {
        this.lastUpdatorId = lastUpdatorId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public int getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(int protocolType) {
        this.protocolType = protocolType;
    }
    @Override
    public String toString(){

        return  "Product{" +
                "id=" + id +
                ", categoryName="  + categoryName +
                ", creatorId="     + creatorId +
                ", lastUpdatorId=" + lastUpdatorId +
                ", createTime="    + createTime +
                ", updateTime="    + updateTime +
                ", productName="   + productName +
                ", productModel="  + productModel +
                ", productType="   + productType +
                ", protocolType="  + protocolType +
                ", contactType="   + contactType +
                ", noteType="      + noteType +
                ", desc="          + desc +
                ", noteType="      + productImage +
                ", delete="        + delete +
                '}';
    }*/
}
