package com.tummosoft;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.ShortName;
import anywheresoftware.b4a.BA.Version;
import java.util.ArrayList;

import java.util.Map;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.FileTemplateResolver;

import java.util.HashMap;

@Version(1.21f)
@ShortName("ThymeleafSupport")
public class ThymeleafSupport {
    Context context = null;    
    Map<String, Object> _variable;
    String _charset;
    Object _classname;
    long _cache;
    boolean _cacheable;
    Map<String, Object> _variableMap;
    private ArrayList<Map> _lst;
    
    private FileTemplateResolver templateResolver;
    private TemplateEngine templateEngine;
    
    public void Initialize() {
        context = new Context();
       _variable = new HashMap<String, Object>();
        _lst = new ArrayList<Map>();
        
        templateResolver = new FileTemplateResolver();
        templateEngine = new TemplateEngine();
    }
       
    public void setVariable(String key, Object value) {
        _variable.put(key, value);
    }

    public void setVariables(anywheresoftware.b4a.objects.collections.Map variable) {
        _variableMap = variable.getObject();
        _lst.add(_variableMap);
    }

    public String toHTML(String ThymeleafTemplate) {
        String templateFilePath = ThymeleafTemplate;
                
        templateResolver.setTemplateMode(TemplateMode.HTML);  
        
        
        if (_cacheable == true) {
            templateResolver.setCacheable(_cacheable);
            templateResolver.setCacheTTLMs(_cache);
        }
        
        templateResolver.setCharacterEncoding(_charset);        
        templateResolver.setSuffix(".html");         
        templateEngine.setTemplateResolver(templateResolver);
        
        context.setVariables( _variable);
        
        int length = _lst.size();
        if (_lst.size() > 0) {
            for (int i=0; i < length; i++) {                
                context.setVariables(_lst.get(i));
            }
        }
               
        String renderedHtml = templateEngine.process(templateFilePath, context);

        return renderedHtml;
    }

    
    public void setEncoding(String charset) {
        _charset = charset;
    }
    
    public void setCacheTTLMs(long value) {
        _cache = value;
    }

    public void setCacheable(boolean value) {
        _cacheable = value;
    }
    
}
