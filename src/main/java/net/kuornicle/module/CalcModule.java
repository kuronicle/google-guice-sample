package net.kuornicle.module;
import net.kuronicle.service.CalcService;
import net.kuronicle.service.CalcServiceImpl;

import com.google.inject.AbstractModule;

public class CalcModule extends AbstractModule {

    @Override
    protected void configure() {
       bind(CalcService.class).to(CalcServiceImpl.class);
    }
}
