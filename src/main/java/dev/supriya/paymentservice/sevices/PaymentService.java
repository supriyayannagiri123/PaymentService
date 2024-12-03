package dev.supriya.paymentservice.sevices;

import com.razorpay.RazorpayException;
import org.springframework.boot.configurationprocessor.json.JSONException;

public interface PaymentService {
    public String generatePaymentLink(Long orderId) throws JSONException, RazorpayException;


}
