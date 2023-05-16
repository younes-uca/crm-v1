package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.UniteAdministrativeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface UniteAdministrativeHistoryDao extends AbstractHistoryRepository<UniteAdministrativeHistory,Long> {

}
