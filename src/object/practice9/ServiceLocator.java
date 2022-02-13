package object.practice9;

import object.practice2.DiscountPolicy;

public class ServiceLocator {
    private static ServiceLocator soleInstance = new ServiceLocator();
    private DiscountPolicy discountPolicy;
    
    public static DiscountPolicy discountPolicy() {
        return soleInstance.discountPolicy;
    }
    
    public static void provide(DiscountPolicy discountPolicy) {
        // 타입에 맞는 discountPolicy 구현 클래스 등록
        soleInstance.discountPolicy = discountPolicy;
    }
    
    private ServiceLocator() {
        
    }
}
