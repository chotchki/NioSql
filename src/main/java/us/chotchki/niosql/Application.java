package us.chotchki.niosql;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args) {
    	new SpringApplicationBuilder()
    	.bannerMode(Banner.Mode.OFF)
    	.sources(Application.class)
        .run(args);
    }
}