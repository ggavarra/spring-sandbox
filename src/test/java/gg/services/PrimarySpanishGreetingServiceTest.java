package gg.services;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gayathrig on 25/12/2018.
 */
public class PrimarySpanishGreetingServiceTest {

    @Test
    public void testSpanishGreeting(){
        PrimarySpanishGreetingService service =new PrimarySpanishGreetingService(new GreetingRepositoryImpl());
        String greeting =service.sayGreeting();
        Assert.assertEquals("Halo GG",greeting);
    }
}