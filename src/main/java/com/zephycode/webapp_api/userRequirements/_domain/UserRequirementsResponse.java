package com.zephycode.webapp_api.userRequirements._domain;

import com.zephycode.webapp_api.components._domain.ComponentResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_requirements")
public class UserRequirementsResponse {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private ComponentResponse component;

    public UserRequirementsResponse(ComponentResponse componentResponse) {
        this.component = componentResponse;
    }

}
