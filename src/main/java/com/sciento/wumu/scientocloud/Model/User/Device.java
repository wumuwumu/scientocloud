package com.sciento.wumu.scientocloud.Model.User;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Device {
    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    private String name;

    private boolean power;     // 开关

    private boolean online;    // 在线

    private String createdAt;  //创建时间

    private String updatedAt;  //更新时间


}
