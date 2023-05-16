package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.TypeContratHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeContratHistoryDao extends AbstractHistoryRepository<TypeContratHistory,Long> {

}
