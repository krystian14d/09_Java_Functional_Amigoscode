package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("John", null, value -> {
            System.out.println("no lastName provided for " + value);
        });

        hello2("John", null, () -> {
            System.out.println("no lastName provided");
        });


    }

    static void hello(String firsName, String lastName, Consumer<String> callback){
        System.out.println(firsName);
        if(lastName != null){
            System.out.println(lastName);
        }else {
            callback.accept(firsName);
        }
    }

    static void hello2(String firsName, String lastName, Runnable callback){
        System.out.println(firsName);
        if(lastName != null){
            System.out.println(lastName);
        }else {
            callback.run();
        }
    }

}
