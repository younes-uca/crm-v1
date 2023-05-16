package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.AbonneHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonneHistoryDao extends AbstractHistoryRepository<AbonneHistory,Long> {

}
