package springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "Examination")
public class Examination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long examinationID;

	@Column(name = "patientID")
	private long patientID;

	@Column(name = "doctorID")
	private long doctorID;

	@Column(name = "nurseID")
	private long nurseID;

	@Column(name = "PrescriptionID")
	private long PrescriptionID;

	@Column(name = "in")
	private String in;

	@Column(name = "out")
	private String out;

	@Column(name = "disease")
	private String disease;

	@Column(name = "totalMoney")
	private float totalMoney;

	public Examination() {
		super();
	}

	public Examination(long examinationID, long patientID, long doctorID, long nurseID, long prescriptionID, String in,
			String out, String disease, float totalMoney) {
		super();
		this.examinationID = examinationID;
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.nurseID = nurseID;
		this.PrescriptionID = prescriptionID;
		this.in = in;
		this.out = out;
		this.disease = disease;
		this.totalMoney = totalMoney;
	}

	public long getExaminationID() {
		return examinationID;
	}

	public void setExaminationID(long examinationID) {
		this.examinationID = examinationID;
	}

	public long getPatientID() {
		return patientID;
	}

	public void setPatientID(long patientID) {
		this.patientID = patientID;
	}

	public long getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(long doctorID) {
		this.doctorID = doctorID;
	}

	public long getNurseID() {
		return nurseID;
	}

	public void setNurseID(long nurseID) {
		this.nurseID = nurseID;
	}

	public long getPrescriptionID() {
		return PrescriptionID;
	}

	public void setPrescriptionID(long prescriptionID) {
		PrescriptionID = prescriptionID;
	}

	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public float getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(float totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	

}
