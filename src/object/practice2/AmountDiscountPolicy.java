package object.practice2;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

  private Money discountAmount;

  public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
    super(conditions);
    this.discountAmount = discountAmount;
  }

  public AmountDiscountPolicy(PeriodCondition periodCondition) {
    super();
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return discountAmount;
  }
}
