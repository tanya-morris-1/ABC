public class C extends B {
    private static final String StaticItem_C = output("Static C initialized");

    static {
        output("Static Initializer C run");
    }

    private final String InstanceItem_C = output("Instance C Initialized");

    C(String input_string){
        super(input_string);
        output("Constructor C run");
    }

    private static final String StaticItem_C2 = output("Static C 2 initialized");

    private final String InstanceItem_C2 = output("Instance C 2 Initialized");
}


