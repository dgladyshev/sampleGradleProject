public class SomeOtherClass {

    private String usedGlobalVariable = "used";

    private long unusedGlobalVariable;

    private void unusedPrivateMethod() {
        String unusedLocalVariable = "unused";
        String usedLocalVariable = this.usedGlobalVariable;
    }

}