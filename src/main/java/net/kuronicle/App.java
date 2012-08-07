package net.kuronicle;

import net.kuornicle.module.CalcModule;
import net.kuronicle.client.CalcClient;
import net.kuronicle.service.CalcService;
import net.kuronicle.service.CalcServiceImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

    public static void main(String[] args) {
        Injector injection = Guice.createInjector(new CalcModule());

        CalcClient calcClient = injection.getInstance(CalcClient.class);
   
        int a = 10;
        int b = 5;
        
        int addition = calcClient.addition(a, b);
        
        System.out.println("Addition: " + addition);
    }
}
