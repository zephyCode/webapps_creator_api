package com.zephycode.webapp_api.components;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class Component {

    @Getter
    @Setter
    private String unselectedColor;

    @Getter
    @Setter
    private String selectedColor;

}
