package com.tly.payment8101.controller;


import com.tly.payment8101.service.PaymentService;
import com.tly.utils.CommonResult;
import com.tly.utils.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-11-15
 */
@Slf4j
@RestController
//@RequestMapping("/payment8101")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        boolean save = paymentService.save(payment);
        log.info("*****插入结果：" + save);

        if (save) {
            return new CommonResult(200, "插入数据库成功,serverPort: " ,payment);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);

        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort: " , payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
        }
    }
}

