package pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public  class BaseEntity {//can made this class abstract and concrete also
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	

}
