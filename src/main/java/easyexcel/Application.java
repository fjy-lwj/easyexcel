package easyexcel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author fjy
 * @date 2021/1/15 18:06
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        //1.返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        //2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(" 查看容器里面的组件 = " + name);
        }

    }
}
