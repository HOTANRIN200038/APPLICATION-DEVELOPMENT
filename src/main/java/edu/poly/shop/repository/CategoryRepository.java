package edu.poly.shop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.poly.shop.domain.Category;



public interface CategoryRepository extends JpaRepository<Category,Long>  {

	Optional<Category> findById(Long id);

}
