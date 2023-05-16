package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.CategorieEmployeeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieEmployeeHistoryDao extends AbstractHistoryRepository<CategorieEmployeeHistory,Long> {

}
