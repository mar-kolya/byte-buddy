package test;

public class HiddenInterfaceTestClass {

    @FunctionalInterface
    interface HiddenInterface {

        default boolean defaultMethod() {
            return false;
        }

        boolean func();
    }

    public static HiddenInterface packagePrivateInterface() {
        return () -> true;
    }

}
