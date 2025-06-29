package com.zephycode.webapp_api.userRequirements._domain;

import com.zephycode.webapp_api.components.Component;
import com.zephycode.webapp_api.components._domain.ComponentRequest;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class UserRequirementsRequest {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private ComponentRequest component;

}


