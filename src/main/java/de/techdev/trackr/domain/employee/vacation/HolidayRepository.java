package de.techdev.trackr.domain.employee.vacation;

import de.techdev.trackr.domain.common.FederalState;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

/**
 * @author Moritz Schulze
 */
@RepositoryRestResource(exported = false)
public interface HolidayRepository extends CrudRepository<Holiday, Long> {

    List<Holiday> findByFederalStateAndDayBetween(FederalState federalState, Date start, Date end);

}