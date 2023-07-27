package com.tummosoft;

import anywheresoftware.b4a.BA.ShortName;
import anywheresoftware.b4a.BA.Version;
import java.util.ArrayList;
import java.util.Map;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import jakarta.servlet.http.HttpSession;
import java.io.Writer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.IWebExchange;

@Version(1.22f)
@ShortName("ThymeleafSupport")
public class ThymeleafSupport {
    Context context = null;    
    Map<String, Object> _variable;
    String _charset = "UTF-8";
    Object _classname;
    long _cache;
    boolean _cacheable;
    Map<String, Object> _variableMap;
    private ArrayList<Map> _lst;    
    private FileTemplateResolver templateResolver;
    private TemplateEngine templateEngine;
    private String _attribute_key;
    private Object _attribute_value;
    private String _prefix;
    private String _suffix;
    private int _order = 0;    
    public TemplateMode MODE;
    private HttpSession session;
    
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
    
    public void setVariables(String path) {
       _prefix = path;
    }
       
    public void setOrder(int order) {
       _order = order;
    }
    
    public void setPrefix(String path) {
       _prefix = path;
    }
       
    public void setSuffix(String path) {
       _suffix = path;
    }
        
    public String toHTML(String ThymeleafTemplate) {
        String templateFilePath = ThymeleafTemplate;
                
        templateResolver.setTemplateMode(TemplateMode.HTML);                 
        if (_cacheable == true) {
            templateResolver.setCacheable(_cacheable);
            templateResolver.setCacheTTLMs(_cache);
        }        
        if ( _prefix != null) {
            templateResolver.setPrefix(_prefix ); 
        }      
        
        templateResolver.setCharacterEncoding(_charset);                
        
        if ( _prefix != null) {
            templateResolver.setSuffix(_suffix);         
        }        
        
        templateEngine.setTemplateResolver(templateResolver);        
        templateResolver.setOrder(_order);
         
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
