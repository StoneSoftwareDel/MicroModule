package org.springboot.springmvc.mybatis.demo.proxy;

public class AmdMainboard implements Mainboard
{
    
    @Override
    public String getMainboardType()
    {
        return "ADM Mainboard";
    }
    
}
