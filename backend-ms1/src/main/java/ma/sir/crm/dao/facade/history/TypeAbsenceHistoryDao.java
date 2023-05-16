package ma.sir.crm.dao.facade.history;

import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.bean.history.TypeAbsenceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAbsenceHistoryDao extends AbstractHistoryRepository<TypeAbsenceHistory,Long> {

}
