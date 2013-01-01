package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * User: xiqohao
 * Date: 13-1-1
 * Time: 下午2:18
 */
@Entity
@Table(name="leaveMessage")
public class LeaveMessage extends BaseModel {
    private Long messageId;
    private String messageTitle;
    private String contactInfo;
    private String messageContent;
    @Id
    @Column(name="messageId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }
    @Column(name="messageTitle")
    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    @Column(name="contactInfo")
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    @Column(name="messageContent")
    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
