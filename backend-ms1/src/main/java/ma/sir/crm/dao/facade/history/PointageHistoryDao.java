package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.PointageHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PointageHistoryDao extends AbstractHistoryRepository<PointageHistory,Long> {

}
