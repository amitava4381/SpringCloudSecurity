package com.app.consumer.consumerservice.models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Student {

    private String name;
    private String department;
    private String section;
}
