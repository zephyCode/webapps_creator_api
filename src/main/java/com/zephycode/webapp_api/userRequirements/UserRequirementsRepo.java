package com.zephycode.webapp_api.userRequirements;

import com.zephycode.webapp_api.userRequirements._domain.UserRequirementsResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRequirementsRepo extends MongoRepository<UserRequirementsResponse, String> {
}
