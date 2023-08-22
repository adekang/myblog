// package com.blog.backend.config;
//
// import com.blog.backend.config.interceptor.JwtInterceptor;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.HandlerInterceptor;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
// /**
//  * Token拦截器配置
//  */
// @Configuration
// public class InterceptorConfig implements WebMvcConfigurer {
//
// //    @Override
// //    public void addInterceptors(InterceptorRegistry registry) {
// //        registry.addInterceptor(jwtInterceptor())
// //                .addPathPatterns("/**")  // 拦截所有请求，通过判断token是否合法来决定是否需要登录
// //                .excludePathPatterns("/user/login", "/user/register", "/**/export", "/**/import", "/file/**",
// //                        "/swagger-resources/**", "/webjars/**","/v3/**", "/v2/**", "/swagger-ui.html/**", "/api", "/api-docs", "/api-docs/**")
// //                .excludePathPatterns("/**/*.html", "/**/*.js", "/**/*.css", "/**/*.woff", "/**/*.ttf");  // 放行静态文件
// //
// //    }
//
//     @Bean
//     public HandlerInterceptor jwtInterceptor() {
//         return new JwtInterceptor();
//     }
//
// }
//
//
//
//
