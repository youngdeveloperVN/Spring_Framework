package com.demo.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
public class NotifyVo implements Serializable {
    @NotBlank
    private Integer id;


    @NotNull
    private Date createdDate;
    @NotNull
    private String create_user;
    private Date updatedDate;
    private String update_user;
}
