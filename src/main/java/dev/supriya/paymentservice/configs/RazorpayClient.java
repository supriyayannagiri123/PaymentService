package dev.supriya.paymentservice.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayClient {


    @Bean
    public RazorpayClient createRazorpayClient(){
        String  razorpayKeyId = "rzp_test_3uM3lOaCK8fZL8";
        String razorpayKeySecret = "kGOwU1NKYqRxNAlOzi1rjaLL";
        return new RazorpayClient();
    }

}
