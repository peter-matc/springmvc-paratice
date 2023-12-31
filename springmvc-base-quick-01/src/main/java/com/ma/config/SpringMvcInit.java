package com.ma.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;





public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * get root config classes
     *
     * @return class<?>[]
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    /**
     * get servlet config classes
     *
     * @return class<?>[]
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }
    // 配置springmvc内部自带servlet 的访问地址
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
