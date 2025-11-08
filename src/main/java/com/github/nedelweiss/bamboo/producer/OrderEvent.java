package com.github.nedelweiss.bamboo.producer;

import java.time.LocalDateTime;
import java.util.Objects;

public class OrderEvent {

    private String eventId;
    private String eventType;
    private String orderId;
    private String userEmail;
    private LocalDateTime timestamp;

    public OrderEvent() {
    }

    public OrderEvent(String eventId, String eventType, String orderId, String userEmail, LocalDateTime timestamp) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.timestamp = timestamp;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderEvent that = (OrderEvent) o;
        return Objects.equals(eventId, that.eventId) && Objects.equals(eventType, that.eventType) && Objects.equals(orderId, that.orderId) && Objects.equals(userEmail, that.userEmail) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventType, orderId, userEmail, timestamp);
    }

    @Override
    public String toString() {
        return "OrderEvent{" +
                "eventId='" + eventId + '\'' +
                ", eventType='" + eventType + '\'' +
                ", orderId='" + orderId + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
