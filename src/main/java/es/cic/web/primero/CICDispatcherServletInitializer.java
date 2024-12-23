package es.cic.web.primero;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CICDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
        };
    }

}
