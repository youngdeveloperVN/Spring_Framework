package com.demo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class CategoryVo implements Serializable {

    private static final long serialVersionUID = 1L;
    @NotBlank
    private Integer id;
    private String name;
    private String description;
    private String imagePath;
    private List<ProductVo> products = new ArrayList<>();

    @NotNull
    private Date createdDate;
    @NotNull
    private String create_user;
    private Date updatedDate;
    private String update_user;

}

