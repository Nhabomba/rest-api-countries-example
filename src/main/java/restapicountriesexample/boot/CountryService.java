package restapicountriesexample.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Zenildo Nhabomba
 * @contact 844642763 || 864642777
 * @email nhabomba.zenildo@gmail.com
 */
@Service
public class CountryService {
	
	@Autowired
	private CountryRepository repository;
	
	public List<Country> listAllCoutries(){
		
		return repository.findAll();
	}
	public List<Country> listAllCoutriesFilterNameOrderByAsc(){
		
		return repository.findByOrderByNameAsc();
	}
	public List<Country> listAllCoutriesFilterNameOrderByDesc(){
		
		return repository.findByOrderByNameDesc();
	}
	public List<Country> listAllCoutriesFilterCapitalOrderByAsc(){
		
		return repository.findByOrderByCapitalAsc();
	}
	public List<Country> listAllCoutriesFilterCapitalOrderByDesc(){
		
		return repository.findByOrderByCapitalDesc();
	}
	public List<Country> listAllCoutriesFilterRegionOrderByAsc(){
		
		return repository.findByOrderByRegionAsc();
	}
	public List<Country> listAllCoutriesFilterRegionOrderByDesc(){
		
		return repository.findByOrderByRegionDesc();
	}
	public List<Country> listAllCoutriesFilterAreaOrderByAsc(){
		
		return repository.findByOrderByAreaAsc();
	}
	public List<Country> listAllCoutriesFilterAreaOrderByDesc(){
		
		return repository.findByOrderByAreaDesc();
	}
	public List<Country> listAllCoutriesFilterSubregionOrderByAsc(){
		
		return repository.findByOrderBySubregionAsc();
	}
	public List<Country> listAllCoutriesFilterSubregionOrderByDesc(){
		
		return repository.findByOrderBySubregionDesc();
	}
	
	public Country saveCountry(Country country) {
		
		return repository.save(country);
	}
	
	public Country getCountryById(Integer id) {
		return repository.findById(id).get();
	}
	
	public void deleteCountry(Integer id) {
		repository.deleteById(id);
	}
	
	

}
