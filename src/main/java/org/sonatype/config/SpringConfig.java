package org.sonatype.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.sonatype.numbersample.translator"})
public class SpringConfig {

}
