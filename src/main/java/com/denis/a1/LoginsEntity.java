package com.denis.a1;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "logins")
public class LoginsEntity implements Serializable {
    private static final long serialVersionUID = 6582894433025277790L;

    @Id
    @Column(name = "l_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "application")
    private String application;

    @Column(name = "app_account_name")
    private String appAccountName;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "department")
    private String department;
}
