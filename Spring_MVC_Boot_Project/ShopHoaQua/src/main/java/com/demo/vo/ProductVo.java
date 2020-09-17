package com.demo.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
public class ProductVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String price;

    private String image1;
    private String image2;
    private String image3;
    private String image4;

    private CategoryVo categoryVo;

    @NotNull
    private Date createdDate;
    @NotNull
    private String create_user;
    private Date updatedDate;
    private String update_user;

}
