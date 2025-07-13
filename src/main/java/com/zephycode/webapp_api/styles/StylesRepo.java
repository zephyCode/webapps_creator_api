package com.zephycode.webapp_api.styles;

import com.zephycode.webapp_api.styles._domain.StylesResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StylesRepo extends MongoRepository<StylesResponse, String> {
}
