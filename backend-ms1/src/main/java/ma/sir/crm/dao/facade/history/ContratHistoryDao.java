package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.ContratHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratHistoryDao extends AbstractHistoryRepository<ContratHistory,Long> {

}
