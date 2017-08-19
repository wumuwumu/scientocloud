package com.sciento.wumu.scientocloud.Model.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
public class User {
    @Id
    @Column(name = "uid")
    @GeneratedValue(generator = "UUID")
    private String uid;

    private String account;

    private String password;

    private String phone;

    private Integer bindNum;

    private String salt;

    private Integer state;

    private String createdAt;

    private String updatedAt;


    @ManyToMany(fetch= FetchType.EAGER)//立即从数据库中进行加载数据;
    @JoinTable(name = "SysUserRole", joinColumns = { @JoinColumn(name = "uid") }, inverseJoinColumns ={@JoinColumn(name = "roleId") })
    private List<SysRole> roleList;// 一个用户具有多个角色


    @Override
    public String toString() {
        return "Member{" +
                "uid='" + uid + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", bindNum=" + bindNum +
                ", salt='" + salt + '\'' +
                ", state=" + state +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
