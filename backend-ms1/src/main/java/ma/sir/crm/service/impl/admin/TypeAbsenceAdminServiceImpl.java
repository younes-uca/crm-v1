package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.TypeAbsence;
import ma.sir.crm.bean.history.TypeAbsenceHistory;
import ma.sir.crm.dao.criteria.core.TypeAbsenceCriteria;
import ma.sir.crm.dao.criteria.history.TypeAbsenceHistoryCriteria;
import ma.sir.crm.dao.facade.core.TypeAbsenceDao;
import ma.sir.crm.dao.facade.history.TypeAbsenceHistoryDao;
import ma.sir.crm.dao.specification.core.TypeAbsenceSpecification;
import ma.sir.crm.service.facade.admin.TypeAbsenceAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeAbsenceAdminServiceImpl extends AbstractServiceImpl<TypeAbsence,TypeAbsenceHistory, TypeAbsenceCriteria, TypeAbsenceHistoryCriteria, TypeAbsenceDao,
TypeAbsenceHistoryDao> implements TypeAbsenceAdminService {


    public TypeAbsence findByReferenceEntity(TypeAbsence t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeAbsence.class,TypeAbsenceHistory.class, TypeAbsenceHistoryCriteria.class, TypeAbsenceSpecification.class);
    }


    public TypeAbsenceAdminServiceImpl(TypeAbsenceDao dao, TypeAbsenceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}