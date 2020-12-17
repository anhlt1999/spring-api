package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.model.Examination;

@Repository
public interface ExaminationRespository extends JpaRepository<Examination, Long> {

}
