package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.TypeCongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCongeHistoryDao extends AbstractHistoryRepository<TypeCongeHistory,Long> {

}
