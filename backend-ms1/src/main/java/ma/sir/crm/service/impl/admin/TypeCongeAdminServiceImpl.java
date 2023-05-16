package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.TypeConge;
import ma.sir.crm.bean.history.TypeCongeHistory;
import ma.sir.crm.dao.criteria.core.TypeCongeCriteria;
import ma.sir.crm.dao.criteria.history.TypeCongeHistoryCriteria;
import ma.sir.crm.dao.facade.core.TypeCongeDao;
import ma.sir.crm.dao.facade.history.TypeCongeHistoryDao;
import ma.sir.crm.dao.specification.core.TypeCongeSpecification;
import ma.sir.crm.service.facade.admin.TypeCongeAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeCongeAdminServiceImpl extends AbstractServiceImpl<TypeConge,TypeCongeHistory, TypeCongeCriteria, TypeCongeHistoryCriteria, TypeCongeDao,
TypeCongeHistoryDao> implements TypeCongeAdminService {


    public TypeConge findByReferenceEntity(TypeConge t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeConge.class,TypeCongeHistory.class, TypeCongeHistoryCriteria.class, TypeCongeSpecification.class);
    }


    public TypeCongeAdminServiceImpl(TypeCongeDao dao, TypeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}