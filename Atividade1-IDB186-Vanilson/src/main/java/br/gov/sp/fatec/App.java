package br.gov.sp.fatec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Carro obj = (Carro) context.getBean("carro");
        System.out.println(obj.tipoLocomocao());
    }
}
