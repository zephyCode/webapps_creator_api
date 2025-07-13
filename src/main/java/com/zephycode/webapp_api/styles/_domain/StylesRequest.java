package com.zephycode.webapp_api.styles._domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class StylesRequest {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String cssContent;

}
