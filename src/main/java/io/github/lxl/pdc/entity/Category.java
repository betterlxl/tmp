package io.github.lxl.pdc.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Description: 产品品类实体
 * @Author: lxl
 * @CreateDate: 2018/12/11 13:31
 * @UpdateUser: lxl
 * @UpdateDate: 2018/12/11 13:31
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class Category {
    /**
     * 产品品类id
     */
    private int id;

    /**
     * 产品品类父id
     */
    private int parentId;
    /**
     * 创建人id
     */
    private int creatorId;
    /**
     * 产品品类名称
     */
    private String categoryName;
    /**
     * 修改人id
     */
    private int lastUpdatorId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 等级
     */
    private int level;

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getLastUpdatorId() {
        return lastUpdatorId;
    }

    public void setLastUpdatorId(int lastUpdatorId) {
        this.lastUpdatorId = lastUpdatorId;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }*/

    /**
     * 是否删除
     */
    private boolean delete;



  /*  @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName="  + categoryName +
                ", creatorId="     + creatorId +
                ", lastUpdatorId=" + lastUpdatorId +
                ", createTime="    + createTime +
                ", updateTime="    + updateTime +
                ", parentId="      + parentId +
                ", level="         + level +
                ", delete="        + delete +
                '}';
    }*/

}
