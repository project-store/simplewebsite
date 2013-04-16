package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * User: SuperHao
 * Date: 13-4-2
 * Time: 上午10:02
 */
@Entity
@Table(name = "randomWish")
public class RandomWish extends BaseModel {
    private Long randomWishId;
    private String sendWishUserName;
    private String wishTitle;
    private String wishContent;
    private String randomWishPicUrl;
    @Id
    @Column(name = "randomWishId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getRandomWishId() {
        return randomWishId;
    }

    public void setRandomWishId(Long randomWishId) {
        this.randomWishId = randomWishId;
    }
    @Column(name = "sendWishUserName")
    public String getSendWishUserName() {
        return sendWishUserName;
    }

    public void setSendWishUserName(String sendWishUserName) {
        this.sendWishUserName = sendWishUserName;
    }
    @Column(name = "wishTitle")
    public String getWishTitle() {
        return wishTitle;
    }

    public void setWishTitle(String wishTitle) {
        this.wishTitle = wishTitle;
    }
    @Column(name = "wishContent",length = 2048)
    public String getWishContent() {
        return wishContent;
    }

    public void setWishContent(String wishContent) {
        this.wishContent = wishContent;
    }
    @Column(name = "randomWishPicUrl")
    public String getRandomWishPicUrl() {
        return randomWishPicUrl;
    }

    public void setRandomWishPicUrl(String randomWishPicUrl) {
        this.randomWishPicUrl = randomWishPicUrl;
    }
}
