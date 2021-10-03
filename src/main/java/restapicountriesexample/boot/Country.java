package restapicountriesexample.boot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Zenildo Nhabomba
 * @contact 844642763 || 864642777
 * @email nhabomba.zenildo@gmail.com
 */

@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String capital;
	private String region;
	private String subregion;
	private String area;
	
	public Country(Integer id, String name, String capital, String region, String subregion, String area) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.region = region;
		this.subregion = subregion;
		this.area = area;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubRegion() {
		return subregion;
	}
	public void setSubRegion(String subRegion) {
		this.subregion = subRegion;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	

}
