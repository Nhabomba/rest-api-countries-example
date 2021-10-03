package restapicountriesexample.boot;

import java.io.Console;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.MethodNotAllowedException;

/**
 * @author Zenildo Nhabomba
 * @contact 844642763 || 864642777
 * @email nhabomba.zenildo@gmail.com
 */

@RestController
public class CountryController {

	@Autowired
	private CountryService service;

	@GetMapping("/countries")
	public List<Country> listAll(@RequestParam(value = "filterBy", required = false) String filterBy,
			@RequestParam(value = "orderBy", required = false) String orderBy) {

		if (filterBy != null && orderBy != null) {
			
			//Filter By Name
			if (filterBy.equalsIgnoreCase("name")) {
				if (orderBy.equalsIgnoreCase("asc"))
					return service.listAllCoutriesFilterNameOrderByAsc();
				else if (orderBy.equalsIgnoreCase("desc"))
					return service.listAllCoutriesFilterNameOrderByDesc();
			}
			
			//Filter By Capital
			if (filterBy.equalsIgnoreCase("capital")) {
				if (orderBy.equalsIgnoreCase("asc"))
					return service.listAllCoutriesFilterCapitalOrderByAsc();
				else if (orderBy.equalsIgnoreCase("desc"))
					return service.listAllCoutriesFilterCapitalOrderByDesc();
			}
			
			//Filter By Region
			if (filterBy.equalsIgnoreCase("region")) {
				if (orderBy.equalsIgnoreCase("asc"))
					return service.listAllCoutriesFilterRegionOrderByAsc();
				else if (orderBy.equalsIgnoreCase("desc"))
					return service.listAllCoutriesFilterRegionOrderByDesc();
			}
			
			//Filter By Area
			if (filterBy.equalsIgnoreCase("area")) {
				if (orderBy.equalsIgnoreCase("asc"))
					return service.listAllCoutriesFilterAreaOrderByAsc();
				else if (orderBy.equalsIgnoreCase("desc"))
					return service.listAllCoutriesFilterAreaOrderByDesc();
			}
			
			//Filter By SubRegion
			if (filterBy.equalsIgnoreCase("subregion")) {
				if (orderBy.equalsIgnoreCase("asc"))
					return service.listAllCoutriesFilterSubregionOrderByAsc();
				else if (orderBy.equalsIgnoreCase("desc"))
					return service.listAllCoutriesFilterSubregionOrderByDesc();
			}
			

		} else {

			return service.listAllCoutries();

		}

		return null;

	}

	@GetMapping("/country/{id}")
	public ResponseEntity<Country> get(@PathVariable Integer id) {

		try {

			Country country = service.getCountryById(id);

			return new ResponseEntity<Country>(country, HttpStatus.OK);
		} catch (NoSuchElementException e) {

			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/country")
	public Country saveCountry(@RequestBody Country country) {

		return service.saveCountry(country);
	}

	@PutMapping("/country/{id}")
	public ResponseEntity<Country> update(@RequestBody Country country, @PathVariable Integer id) {

		try {

			Country country2 = service.getCountryById(id);

			updateElements(country2, country);

			service.saveCountry(country2);

			return new ResponseEntity<Country>(country2, HttpStatus.OK);

		} catch (NoSuchElementException e) {

			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/country/{id}")
	public ResponseEntity<Country> deleteCountry(@PathVariable Integer id) {

		try {

			service.deleteCountry(id);

			return new ResponseEntity<Country>(HttpStatus.OK);

		} catch (NoSuchElementException e) {

			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);

		}

	}

	private void updateElements(Country country2, Country country) {

		country2.setName(country.getName());
		country2.setCapital(country.getCapital());
		country2.setRegion(country.getRegion());
		country2.setSubRegion(country.getSubRegion());
		country2.setArea(country.getArea());
	}

}
