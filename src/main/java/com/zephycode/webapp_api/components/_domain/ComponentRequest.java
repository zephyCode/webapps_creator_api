package com.zephycode.webapp_api.components._domain;

import com.zephycode.webapp_api.components.Component;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class ComponentRequest extends Component {

    @Id
    @Getter
    @Setter
    private String Id;

    @Getter
    @Setter
    private String tabsName;

}
