package at.qe.sepm.skeleton.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import at.qe.sepm.skeleton.model.Booking;
import at.qe.sepm.skeleton.model.User;
import at.qe.sepm.skeleton.model.UserRole;

public interface BookingRepo extends CrudRepository<Booking, Integer> {

    Booking findFirstByBookingId(Integer id);

//    List<User> findByUsernameContaining(String username);
//
//    @Query("SELECT u FROM User u WHERE CONCAT(u.firstName, ' ', u.lastName) = :wholeName")
//    List<User> findByWholeNameConcat(@Param("wholeName") String wholeName);
//
//    @Query("SELECT u FROM User u WHERE :role MEMBER OF u.roles")
//    List<User> findByRole(@Param("role") UserRole role);
    
}