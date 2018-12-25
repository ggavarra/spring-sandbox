package guru.springframework.services;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gayathrig on 25/12/2018.
 */
public class PrimarySpanishGreetingServiceTest {

    @Test
    public void testSpanishGreeting(){
        PrimarySpanishGreetingService service =new PrimarySpanishGreetingService();
        String greeting =service.sayGreeting();
        Assert.assertEquals("test",greeting);
    }
}