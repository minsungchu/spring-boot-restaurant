package kr.co.fastcampus.eatgo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findAll();

    Optional<Restaurant> findById(Long id); // Optional은 java 8부터 추가됨. 이는 Null을 처리하지 않고 Restaurant가 있냐/없냐만 판단함.

    Restaurant save(Restaurant restaurant);
}
