package nl.mfarr.supernova.services;
import nl.mfarr.supernova.repositories.CustomerRepository;
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
