package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * User: xiqohao
 * Date: 13-1-1
 * Time: 下午2:26
 */
@Entity
@Table(name="Product")
public class Product extends BaseModel {
    private Long productId;
    private String productName;
    private String productImg;
    private Double productPrice;
    private String productInfo;
    private Long productCateId;
    private String productCateName;
    @Id
    @Column(name="productId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    @Column(name="productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    @Column(name="productImg")
    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }
    @Column(name="productPrice")
    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
    @Column(name="productInfo")
    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }
    @Column(name="productCateId")
    public Long getProductCateId() {
        return productCateId;
    }

    public void setProductCateId(Long productCateId) {
        this.productCateId = productCateId;
    }
    @Column(name="productCateName")
    public String getProductCateName() {
        return productCateName;
    }

    public void setProductCateName(String productCateName) {
        this.productCateName = productCateName;
    }
}
