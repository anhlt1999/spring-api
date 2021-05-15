package web.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Banmau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ten;
	private String mota;
	private String thanhPhan;
	
	@ManyToOne(targetEntity = Nhanvien.class)
	private Nhanvien nhanviens;
	
	@ManyToOne(targetEntity = Donhang.class)
	private Donhang donhangs;
}
