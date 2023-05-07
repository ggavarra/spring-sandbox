package gg.customAnnotations;

public class JsonSerializer<T> {

    public static String objectToJson(Object object){

        if(object.getClass().getDeclaredAnnotationsByType(JsonSerializable.class)!=null){
            System.out.println("This object is JsonSerializer");
        }


        return null;
    }
}
