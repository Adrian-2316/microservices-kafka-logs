package com.kafka.producer.content.analytics.service;

import com.kafka.producer.content.analytics.models.Analytics;
import com.kafka.producer.content.analytics.service.ports.in.AnalyticsPort;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.Random;
import java.util.UUID;

@Service

public class AnalyticsService implements AnalyticsPort {


    private final Long id;
    private final double heigth;
    private final Random random;
    private KafkaTemplate<String, Analytics> kafkaTemplate;

    public AnalyticsService(KafkaTemplate<String, Analytics> kafkaTemplate) {
        this.random = new Random();
        this.kafkaTemplate = kafkaTemplate;
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.heigth = random.nextDouble(100, 210);
    }


    @Override
    public void sendAnalytics() {
        Analytics analytics = new Analytics();
        randomizeAnalytics(analytics);
        ListenableFuture<SendResult<String, Analytics>> future =
                kafkaTemplate.send("analytics", UUID.randomUUID().toString(), analytics);

        future.addCallback(
                new ListenableFutureCallback<>() {

                    @Override
                    public void onSuccess(SendResult<String, Analytics> result) {
                        System.out.println(
                                "Sent message=["
                                        + analytics
                                        + "] with offset=["
                                        + result.getRecordMetadata().offset()
                                        + "]");
                    }

                    @Override
                    public void onFailure(Throwable ex) {
                        System.out.println(
                                "Unable to send message=[" + analytics + "] due to : " + ex.getMessage());
                    }
                });
    }

    public void randomizeAnalytics(Analytics analytics) {

        analytics.setId(random.nextLong());
        //random number between 0 and 150
        analytics.setGlucose(random.nextDouble(60, 160));
        analytics.setBloodPressure(random.nextDouble(70, 190));
        analytics.setHeartRate(random.nextInt(30, 200));
        analytics.setDoingSport(random.nextBoolean());
        analytics.setTemperature(random.nextDouble(33, 43));
        analytics.setHeight(this.heigth);
        analytics.setWeight(random.nextDouble(40,190));
        analytics.setTimestamp(String.valueOf(System.currentTimeMillis()));
    }
}
