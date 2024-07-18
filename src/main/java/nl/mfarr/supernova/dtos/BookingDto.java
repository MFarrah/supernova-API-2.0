package nl.mfarr.supernova.dtos;

import nl.mfarr.supernova.entities.CustomerEntity;
import nl.mfarr.supernova.entities.EmployeeEntity;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

public class BookingDto {

    private Long id;
    private CustomerDto customer;
    private EmployeeDto employee;
    private Set orders;
    private double price;
    private LocalDateTime currentDateTime = LocalDateTime.now();
    private LocalDateTime startTime;
    private Duration duration; //duration based on order(s) time//= Duration.ofHours(0).plusMinutes(0);//
    private String estimatedEndTime;

    public BookingDto() {
    }

    public BookingDto(Long id, CustomerDto customer, EmployeeDto employee, Set orders, double price, LocalDateTime currentDateTime, LocalDateTime startTime, Duration duration, String estimatedEndTime) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
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

    public String getEstimatedEndTime() {
        return estimatedEndTime;
    }

    public void setEstimatedEndTime(String estimatedEndTime) {
        this.estimatedEndTime = estimatedEndTime;
    }
}
