package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.CategorieEmployee;
import ma.sir.crm.bean.history.CategorieEmployeeHistory;
import ma.sir.crm.dao.criteria.core.CategorieEmployeeCriteria;
import ma.sir.crm.dao.criteria.history.CategorieEmployeeHistoryCriteria;
import ma.sir.crm.dao.facade.core.CategorieEmployeeDao;
import ma.sir.crm.dao.facade.history.CategorieEmployeeHistoryDao;
import ma.sir.crm.dao.specification.core.CategorieEmployeeSpecification;
import ma.sir.crm.service.facade.admin.CategorieEmployeeAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class CategorieEmployeeAdminServiceImpl extends AbstractServiceImpl<CategorieEmployee,CategorieEmployeeHistory, CategorieEmployeeCriteria, CategorieEmployeeHistoryCriteria, CategorieEmployeeDao,
CategorieEmployeeHistoryDao> implements CategorieEmployeeAdminService {


    public CategorieEmployee findByReferenceEntity(CategorieEmployee t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(CategorieEmployee.class,CategorieEmployeeHistory.class, CategorieEmployeeHistoryCriteria.class, CategorieEmployeeSpecification.class);
    }


    public CategorieEmployeeAdminServiceImpl(CategorieEmployeeDao dao, CategorieEmployeeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}