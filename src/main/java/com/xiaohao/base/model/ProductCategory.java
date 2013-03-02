package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * User: xiqohao
 * Date: 13-1-1
 * Time: 下午2:28.
 */
@Entity
@Table(name="ProductCategory")
public class ProductCategory extends BaseModel {
    private Long productCateId;
    private String productCateName;
    private Integer cateSort;
    @Id
    @Column(name="productCateId")
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    @Column(name="cateSort")
    public Integer getCateSort() {
        return cateSort;
    }

    public void setCateSort(Integer cateSort) {
        this.cateSort = cateSort;
    }
}
