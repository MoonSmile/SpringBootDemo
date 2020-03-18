package com.example.demo.Import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({ MyImportSelector.class })
@Import({ MyImportSelector.class, MyImportBeanDefinitionRegistrar.class })
public class ImportSelectorMainConfig {
}
