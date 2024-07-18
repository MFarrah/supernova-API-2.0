package nl.mfarr.supernova.services;

import nl.mfarr.supernova.repositories.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService (BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

}
