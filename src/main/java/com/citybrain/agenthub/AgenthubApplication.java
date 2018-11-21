package com.citybrain.agenthub;

import com.citybrain.agenthub.model.GridInfo;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MappedTypes(GridInfo.class)           // 可以mapped多个类  MappedTypes(GridInfo.class, .....)
@MapperScan("com.citybrain.agenthub.mapper")
// 用于统一指定接口类位置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AgenthubApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgenthubApplication.class, args);
    }
}
