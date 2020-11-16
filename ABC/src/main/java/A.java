public class A {

    private static final String StaticItem_A = output("Static A initialized");

    static {
        output("Static Initializer A run");
    }

    private final String InstanceItem_A = output("Instance A Initialized");

    A(String input_string){
        output("Constructor A run");
    }

    private static final String StaticItem_A2 = output("Static A 2 initialized");

    private final String InstanceItem_A2 = output("Instance A 2 Initialized");

    protected static String output(String input){
        System.out.println(input);
        return input;
    }

}
