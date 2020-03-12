package com.kevin.task.annotation;

import com.kevin.task.autoconfigure.JobParserAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(JobParserAutoConfiguration.class)
public @interface EnableElasticJob {
}
