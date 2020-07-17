package com.gh.member.ghmember;

import com.gh.common.utils.R;
import com.gh.member.feign.CouponFeginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GhMemberApplicationTests {
    @Autowired
    private CouponFeginService couponFeginService;

    @Test
    void contextLoads() {
        R r = couponFeginService.memberCoupons();
        System.out.println(r);
    }

}
