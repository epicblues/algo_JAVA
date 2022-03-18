package programmers;

import programmers.templatemethod.ImplementationClass;
import programmers.templatemethod.TemplateClass;

public class Program {
    public static void main(String[] args) {
        TemplateClass t = new ImplementationClass();
        t.templateMethod(); // beforeCalculation 호출 불가능

    }
}



