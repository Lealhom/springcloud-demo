package com.lealhom.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Lealhom on 2018/1/15 12:21
 * Description:
 */
//@Component
@Data
public class ApplicationProperty {
    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;

    @Value("${book.desc}")
    private String desc;

    @Value("${random.version}")
    private String version;
}
