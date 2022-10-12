package ru.netology.jdhomeworks_Spring_boot_Task1.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.jdhomeworks_Spring_boot_Task1.systemProfile.DevProfile;
import ru.netology.jdhomeworks_Spring_boot_Task1.systemProfile.ProductionProfile;
import ru.netology.jdhomeworks_Spring_boot_Task1.systemProfile.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile(){
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false", matchIfMissing = true)
    public SystemProfile prodProfile(){
        return new ProductionProfile();
    }
}
