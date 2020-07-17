package com.gh.member.feign;

import com.gh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gh-coupon")
public interface CouponFeginService {

    /**
     *
     * @return
     */
    @RequestMapping("/coupon/coupon/list")
    public R memberCoupons();
}
