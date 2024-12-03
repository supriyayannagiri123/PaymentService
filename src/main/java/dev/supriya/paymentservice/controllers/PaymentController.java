package dev.supriya.paymentservice.controllers;


import dev.supriya.paymentservice.dtos.GeneratePaymentLinkRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PaymentController {

    @PostMapping("/Payment")
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkRequestDto generatePaymentLinkRequestDto) {
        //return generatePaymentLinkRequestDto.OrderId();
        return null;
    }
}
