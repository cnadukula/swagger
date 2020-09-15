package com.example.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import io.swagger.annotations.ApiModelProperty;


@Data
@AllArgsConstructor
public class User {

    @ApiModelProperty(example="Jane")
    private String firstName;

    @ApiModelProperty(example="Doe")
    private String lastName;

    @ApiModelProperty(example="Ashburn, VA")
    private String address;

    @ApiModelProperty(example="female")
    private String gender;

}
