package net.kuronicle.client;

import com.google.inject.Inject;

import net.kuronicle.service.CalcService;

public class CalcClient {
    
    @Inject
    private CalcService calcService;

    public int addition(int a, int b) {
        return calcService.add(a, b);
    }

}
