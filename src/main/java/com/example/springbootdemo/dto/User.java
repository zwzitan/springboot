package com.example.springbootdemo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @ApiModelProperty("用户id")
    private String id;
    @ApiModelProperty("用户名字")
    private String username;

}