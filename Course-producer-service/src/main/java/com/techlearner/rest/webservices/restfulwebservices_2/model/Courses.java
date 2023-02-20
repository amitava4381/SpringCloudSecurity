package com.techlearner.rest.webservices.restfulwebservices_2.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Courses {

    public String id;
    public String name;
    public int price;
}
