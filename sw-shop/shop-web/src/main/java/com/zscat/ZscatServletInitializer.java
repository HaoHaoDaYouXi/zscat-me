package com.zscat;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Guns Web程序启动类
 *
 * @author fengshuonan
 * @date 2017-05-21 9:43
 */
public class ZscatServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BlogWebApplication.class);
    }

}