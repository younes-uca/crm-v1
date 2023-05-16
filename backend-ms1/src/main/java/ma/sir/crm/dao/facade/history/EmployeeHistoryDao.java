package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.EmployeeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeHistoryDao extends AbstractHistoryRepository<EmployeeHistory,Long> {

}
