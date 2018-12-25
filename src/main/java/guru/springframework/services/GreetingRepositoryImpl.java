package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * Created by gayathrig on 25/12/2018.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello GG";
    }

    @Override
    public String getSpanishGreeting() {
        return "Halo GG";
    }

    @Override
    public String getGermanGreeting() {
        return "Guten Mornin";
    }
}
