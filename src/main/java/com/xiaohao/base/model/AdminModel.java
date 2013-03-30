package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午7:38
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "adminModel")
public class AdminModel extends BaseModel {

    private Long modelId;
    private String modelName;
    private String modelUrl;
    private Integer useFlag;
    private Integer orderBy;
    @Id
    @Column(name="userId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }
    @Column(name = "modelName")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    @Column(name = "modelUrl")
    public String getModelUrl() {
        return modelUrl;
    }

    public void setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
    }
    @Column(name = "userFlag")
    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }
    @Column(name = "orderBy")
    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }
}
