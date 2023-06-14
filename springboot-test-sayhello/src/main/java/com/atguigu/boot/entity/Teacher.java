package com.atguigu.boot.entity;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "atguigu")
public class Teacher {
    private Integer teaId;
    private String teaName;
    private List<String> subjectList;
}
