package effective_java.item1;

import java.util.Objects;

public class StaticChildClass extends StaticSuperClass {


  /*@spec_public@*/ String target;

  public void sayHello(String target) {
    this.target = Objects.requireNonNull(target);
  }
}
