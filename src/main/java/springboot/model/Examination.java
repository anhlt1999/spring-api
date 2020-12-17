package springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Examination")
public class Examination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long examinationID;

	@Column(name = "doctorID")
	private int doctorID;

	@Column(name = "nurseID")
	private int nurseID;


	@Column(name = "patientID")
	private int patientID;
	@Column(name = "prescriptionID")
	private int prescriptionID;
	@Column(name = "indate")
	private String in;
	@Column(name = "outdate")
	private String out;
	@Column(name = "disease")
	private String disease;
	@Column(name = "totalMoney")
	private String totalMoney;
	public Examination() {

	}

	public Examination(long examinationID, int doctorID, int nurseID, int patientID, int prescriptionID, String in, String out, String disease, String totalMoney) {
		super();
		this.examinationID = examinationID;
		this.doctorID = doctorID;
		this.nurseID = nurseID;
		this.patientID = patientID;
		this.prescriptionID = prescriptionID;
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

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public int getNurseID() {
		return nurseID;
	}

	public void setNurseID(int nurseID) {
		this.nurseID = nurseID;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public int getPrescriptionID() {
		return prescriptionID;
	}

	public void setPrescriptionID(int prescriptionID) {
		this.prescriptionID = prescriptionID;
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

	public String getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
}
