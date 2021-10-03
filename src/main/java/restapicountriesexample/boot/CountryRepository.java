package restapicountriesexample.boot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Zenildo Nhabomba
 * @contact 844642763 || 864642777
 * @email nhabomba.zenildo@gmail.com
 */

public interface CountryRepository  extends JpaRepository<Country, Integer>{
	
	
	public List<Country> findByOrderByNameAsc();
	public List<Country> findByOrderByNameDesc();
	public List<Country> findByOrderByCapitalAsc();
	public List<Country> findByOrderByCapitalDesc();
	public List<Country> findByOrderByRegionAsc();
	public List<Country> findByOrderByRegionDesc();
	public List<Country> findByOrderByAreaAsc();
	public List<Country> findByOrderByAreaDesc();
	public List<Country> findByOrderBySubregionAsc();
	public List<Country> findByOrderBySubregionDesc();


}
