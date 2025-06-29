package com.zephycode.webapp_api.userRequirements;

import com.zephycode.webapp_api.components._domain.ComponentResponse;
import com.zephycode.webapp_api.userRequirements._domain.UserRequirementsRequest;
import com.zephycode.webapp_api.userRequirements._domain.UserRequirementsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.UUID;

@RestController
@RequestMapping("/api/user-requirements")
public class UserRequirementsController {

    @Autowired
    private UserRequirementsRepo repo;

    @PostMapping
    public ResponseEntity<?> createUserRequirement(@RequestBody UserRequirementsRequest requirementsRequest) {
        String[] tabsName = requirementsRequest.getComponent().getTabsName().split(", ");
        ComponentResponse componentResponse = new ComponentResponse(UUID.randomUUID().toString(), Arrays.asList(tabsName));
        componentResponse.setSelectedColor(requirementsRequest.getComponent().getSelectedColor());
        componentResponse.setUnselectedColor(requirementsRequest.getComponent().getUnselectedColor());
        UserRequirementsResponse response = new UserRequirementsResponse(componentResponse);
        repo.save(response);
        return ResponseEntity.ok(response);
    }

}
