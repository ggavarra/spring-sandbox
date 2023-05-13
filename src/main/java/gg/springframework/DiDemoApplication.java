package gg.springframework;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"gg.controllers", "gg.services"})
@EnableAspectJAutoProxy
public class DiDemoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);


       /* Map<String, String> configMap = new HashMap<>();
        Configuration configuration = Configuration.fromMap(configMap);
        ExecutionEnvironment env = new ExecutionEnvironment(configuration);*/

     /*   ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSource<String> stringDataSource = env.fromCollection(Arrays.asList("a", "b", "c"));
        stringDataSource.collect();
        DataSink sink = new DataSink(stringDataSource, new PrintingOutputFormat(), IntegerTypeInfo.INSTANT_TYPE_INFO);

        try {
            env.execute("TransactionEnricher");

        } catch (Exception e) {
            e.printStackTrace();
        }*/
        ExecutionEnvironment env
                = ExecutionEnvironment.getExecutionEnvironment();

        DataSet<Integer> amounts = env.fromElements(1, 29, 40, 50);
        int threshold = 30;
        List<Integer> collect = amounts
                .filter(a -> a > threshold)
                .reduce((integer, t1) -> integer + t1)
                .collect();

        System.out.println("Aggregate Amount from first job is "+collect.get(0));


        /*ExecutionEnvironment env2
                = ExecutionEnvironment.getExecutionEnvironment();
*/
        DataSet<Integer> amounts1 = env.fromElements(1, 29, 40, 50);
        int threshold1= 25;
        List<Integer> collect1 = amounts1
                .filter(a -> a > threshold1)
                .reduce((integer, t1) -> integer + t1)
                .collect();

        System.out.println("Aggregate Amount from second job is "+collect1.get(0));


    }
}
