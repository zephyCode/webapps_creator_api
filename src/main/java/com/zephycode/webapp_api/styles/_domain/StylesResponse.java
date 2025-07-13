package com.zephycode.webapp_api.styles._domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "styles")
public class StylesResponse {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String cssContent;

    public StylesResponse() {}

    public StylesResponse(String id, String cssContent) {
        this.id = id;
        this.cssContent = cssContent;
    }

}
