package com.imooc.video.domain.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.METHOD})
@Component
public @interface ApiLimitedRole {

    String[] limitedRoleCodeList() default {};
}
