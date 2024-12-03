package dev.supriya.paymentservice.dtos;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class GeneratePaymentLinkRequestDto {
    public Long OrderId;
}
