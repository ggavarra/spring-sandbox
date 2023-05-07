package gg.aop;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class GeneralController {

    @LogExecutionTime
    public double fetchAccountBalance() {

        return 12.0;
    }
}
