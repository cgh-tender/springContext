package cn.com.header.app.test;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    private String name = "test";
    private String id;
}
