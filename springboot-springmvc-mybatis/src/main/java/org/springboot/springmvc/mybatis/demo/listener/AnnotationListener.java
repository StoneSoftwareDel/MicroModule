package org.springboot.springmvc.mybatis.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AnnotationListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent)
    {
        
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent)
    {
        
    }
}