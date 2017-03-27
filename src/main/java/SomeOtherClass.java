public class SomeOtherClass {

    private String usedGlobalVariable = "used";

    private long unusedGlobalVariable;

    private String unusedPrivateMethod() {
        String unusedLocalVariable = "unused";
        String usedLocalVariable = this.usedGlobalVariable;
        return usedLocalVariable;
    }

}