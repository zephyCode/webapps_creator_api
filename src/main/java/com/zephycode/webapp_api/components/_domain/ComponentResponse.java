package com.zephycode.webapp_api.components._domain;

import com.zephycode.webapp_api.components.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@AllArgsConstructor
public class ComponentResponse extends Component {

    @Id
    @Getter
    @Setter
    private String Id;

    @Getter
    @Setter
    private List<String> tabsName;

}
