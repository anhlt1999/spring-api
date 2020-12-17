package springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.exception.ResourceNotFoundException;
import springboot.model.Examination;
import springboot.repository.ExaminationRespository;

@CrossOrigin(origins = "https://ltwebptit.herokuapp.com")
@RestController
@RequestMapping("/api/v1/")
public class ExaminationController {

	@Autowired
	private ExaminationRespository examinationRepository;
	
	// get all exam
	@GetMapping("/examinations")
	public List<Examination> getAllExaminations(){
		return examinationRepository.findAll();
	}		
	
	// create exam rest api
	@PostMapping("/examinations")
	public Examination createExamination(@RequestBody Examination exam) {
		return examinationRepository.save(exam);
	}
	
	// get exam by id rest api
	@GetMapping("/examinations/{id}")
	public ResponseEntity<Examination> getExaminationById(@PathVariable Long id) {
		Examination exam = examinationRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Examination not exist with id :" + id));
		return ResponseEntity.ok(exam);
	}
	
	// update exam rest api
	
	@PutMapping("/examinations/{id}")
	public ResponseEntity<Examination> updateExamination(@PathVariable Long id, @RequestBody Examination examDetails){
		Examination exam = examinationRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Exam not exist with id :" + id));
		exam.setPatientID(examDetails.getPatientID());
		exam.setDoctorID(examDetails.getDoctorID());
		exam.setNurseID(examDetails.getNurseID());
		exam.setPrescriptionID(examDetails.getPrescriptionID());
		exam.setIn(examDetails.getIn());
		exam.setOut(examDetails.getOut());
		exam.setDisease(examDetails.getDisease());
		exam.setTotalMoney(examDetails.getTotalMoney());
		Examination updatedExam = examinationRepository.save(exam);
		return ResponseEntity.ok(updatedExam);
	}
	
	// delete exam rest api
	@DeleteMapping("/examinations/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteDoctor(@PathVariable Long id){
		Examination exam = examinationRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Examination not exist with id :" + id));
		
		examinationRepository.delete(exam);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
