package repository;

import base.repository.BaseRepository;
import domain.Airline;
import domain.User;

public interface AirlineRepository extends BaseRepository<Airline,Long> {
    Airline findByOwnerId(User user);

}
