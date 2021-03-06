package at.qe.sepm.skeleton.repositories;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import at.qe.sepm.skeleton.model.Booking;
import at.qe.sepm.skeleton.model.User;
import at.qe.sepm.skeleton.model.UserRole;

public interface BookingRepo extends CrudRepository<Booking, Integer> {

	@Override
	List<Booking> findAll();
	
    Booking findFirstByBookingId(Integer id);

    @Query("SELECT b FROM Booking b WHERE b.bookingId > :from AND b.bookingId < :to")
    List<Booking> findBookingsInRange(@Param("from") Integer from, @Param("to") Integer to);
    
//    List<User> findByUsernameContaining(String username);
//
//    @Query("SELECT u FROM User u WHERE CONCAT(u.firstName, ' ', u.lastName) = :wholeName")
//    List<User> findByWholeNameConcat(@Param("wholeName") String wholeName);
//
//    @Query("SELECT u FROM User u WHERE :role MEMBER OF u.roles")
//    List<User> findByRole(@Param("role") UserRole role);
    
}