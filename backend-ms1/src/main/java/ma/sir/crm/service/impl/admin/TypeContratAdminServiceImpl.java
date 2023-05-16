package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.TypeContrat;
import ma.sir.crm.bean.history.TypeContratHistory;
import ma.sir.crm.dao.criteria.core.TypeContratCriteria;
import ma.sir.crm.dao.criteria.history.TypeContratHistoryCriteria;
import ma.sir.crm.dao.facade.core.TypeContratDao;
import ma.sir.crm.dao.facade.history.TypeContratHistoryDao;
import ma.sir.crm.dao.specification.core.TypeContratSpecification;
import ma.sir.crm.service.facade.admin.TypeContratAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeContratAdminServiceImpl extends AbstractServiceImpl<TypeContrat,TypeContratHistory, TypeContratCriteria, TypeContratHistoryCriteria, TypeContratDao,
TypeContratHistoryDao> implements TypeContratAdminService {


    public TypeContrat findByReferenceEntity(TypeContrat t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeContrat.class,TypeContratHistory.class, TypeContratHistoryCriteria.class, TypeContratSpecification.class);
    }


    public TypeContratAdminServiceImpl(TypeContratDao dao, TypeContratHistoryDao historyDao) {
        super(dao, historyDao);
    }

}