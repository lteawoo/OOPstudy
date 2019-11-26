package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/* classpath: main 아래부터.. */
public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:expert003/expert003.xml");

        Car car = context.getBean("car", Car.class);

        System.out.println(car.getTireBrand());
    }
}