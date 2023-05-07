package gg.customAnnotations;

@JsonSerializable
public class Person {

    @JsonElement
    public String firstName;

    @JsonElement
    public String lastName;


    public String age;
    public String address;

    @Init
    public void init(){

    }

}
