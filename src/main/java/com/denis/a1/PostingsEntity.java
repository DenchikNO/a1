package com.denis.a1;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "postings")
public class PostingsEntity implements Serializable {

    @Id
    @Column(name = "p_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mat_doc")
    private long matDoc;

    @Column(name = "item")
    private int item;

    @Column(name = "doc_date")
    private String docDate;

    @Column(name = "pstng_date")
    private String pstngDate;

    @Column(name = "material_description")
    private String materialDescription;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "bun")
    private String bun;

    @Column(name = "amount_lc")
    private double amountLc;

    @Column(name = "crcy")
    private String crcy;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "authorized_shipping")
    private boolean authorizedShipping;
}
