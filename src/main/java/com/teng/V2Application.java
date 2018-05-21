package com.teng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class V2Application {

    public static void main(String[] args) {
        SpringApplication.run(V2Application.class,args);
    }

//    @Autowired
//    private SpringTemplateEngine springTemplateEngine;
//
//
//    @Bean
//    public ViewResolver viewResolver(SpringTemplateEngine templateEngine){
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine);
//        return resolver;
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver){
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.setTemplateResolver(templateResolver);
//        return engine;
//    }


//    @Bean
//    public TemplateResolver templateResolver(){
//        TemplateResolver resolver = new SpringResourceTemplateResolver();
//        resolver.setPrefix("classpath:/templates/");//设置地址前缀
//        resolver.setSuffix(".html");//设置后缀
//        resolver.setCacheable(false);//设置不缓存
//        resolver.setTemplateMode("HTML5");
//        return resolver;
//
//    }

}
