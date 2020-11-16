public class B extends A{
    private static final String StaticItem_B = output("Static B initialized");

    static {
        output("Static Initializer B run");
    }

    private final String InstanceItem_B = output("Instance B Initialized");

    B(String input_string){
        super(input_string);
        output("Constructor B run");
    }

    private static final String StaticItem_B2 = output("Static B 2 initialized");

    private final String InstanceItem_B2 = output("Instance B 2 Initialized");

}
