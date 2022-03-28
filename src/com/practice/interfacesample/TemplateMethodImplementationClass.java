package com.practice.interfacesample;

public abstract class TemplateMethodImplementationClass {


  private Runnable hook = null;
  private Runnable cleanUp = null;

  public void setFrontHook(Runnable hook) {
    this.hook = hook;
  }

  public void setCleanUp(Runnable cleanUp) {
    this.cleanUp = cleanUp;
  }

  protected abstract void template1();

  protected abstract void template2();

  protected abstract void template3();

  public final void templateMethod() {
    if (hook != null) {
      hook.run();
    }

    template1();
    template2();
    template3();

    if (cleanUp != null) {
      hook.run();
    }

  }

}
