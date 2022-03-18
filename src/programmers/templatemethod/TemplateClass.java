package programmers.templatemethod;

public abstract class TemplateClass {
    public void templateMethod() {
        this.beforeCalculation();
        System.out.println("beforeCalculation activated");
        this.afterCalculation();
        int a = 10 + 4 + 5;

    }

    protected abstract void beforeCalculation();
    protected abstract void afterCalculation();
}
