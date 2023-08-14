package com.claudiocavallaro.app.be.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.claudiocavallaro.app.persistence.DemoDbPersistenceConfig;

@Configuration
@Import({DemoDbPersistenceConfig.class})
public class DemoDbBEConfig {

}
