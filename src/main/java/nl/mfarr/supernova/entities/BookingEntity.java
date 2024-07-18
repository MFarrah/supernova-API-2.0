package nl.mfarr.supernova.entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

public class BookingEntity {

    private Long id;
    private CustomerEntity customer;
    private EmployeeEntity employee;
    private Set orders;
    private double price;
    private LocalDateTime currentDateTime = LocalDateTime.now();
    private LocalDateTime startTime;
    private Duration duration; //duration based on order(s) time//= Duration.ofHours(0).plusMinutes(0);//
    private String estimatedEndTime;

    public BookingEntity() {
    }

    public BookingEntity(Long id, CustomerEntity customer, EmployeeEntity employee, Set orders, double price, LocalDateTime currentDateTime, LocalDateTime startTime, Duration duration, String estimatedEndTime) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.orders = orders;
        this.price = price;
        this.currentDateTime = currentDateTime;
        this.startTime = startTime;
        this.duration = duration;
        this.estimatedEndTime = estimatedEndTime;
    }

    public String getEstimatedEndTime() {
        return estimatedEndTime;
    }

    public void setEstimatedEndTime(String estimatedEndTime) {
        this.estimatedEndTime = estimatedEndTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public Set getOrders() {
        return orders;
    }

    public void setOrders(Set orders) {
        this.orders = orders;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

}
