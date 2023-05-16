package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.CongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CongeHistoryDao extends AbstractHistoryRepository<CongeHistory,Long> {

}
