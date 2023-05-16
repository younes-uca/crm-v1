package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.AbsenceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsenceHistoryDao extends AbstractHistoryRepository<AbsenceHistory,Long> {

}
