package com.nju.tkd.config;

import com.nju.tkd.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author huwen
 * @date 2019/3/23
 */

//这是一个配置类
//    使用这个类的配置可以实现扩展SpringMVC的功能

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
    public final static String SESSION_KEY = "user";

    //这里重新配置了一个拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //要拦截的内容
        registry.addInterceptor(new SessionInterceptor()).
                //这里设置了不要拦截的页面
                excludePathPatterns("/login", "/index", "/signUp", "/register", "/error", "/**/*.css", "/**/*.js", "/**/*.png", "/**/*.gif", "/**/*.jpg", "/**/*.jpeg", "/font/**").addPathPatterns("/**");
    }
}
