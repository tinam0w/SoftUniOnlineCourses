package InterfacesАndAbstractionLab.SayHello;

public interface Person {
    String getName();

    default String sayHello(){
        return "Hello";
    }
}
