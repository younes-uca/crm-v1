package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.UniteAdministrative;
import ma.sir.crm.bean.history.UniteAdministrativeHistory;
import ma.sir.crm.dao.criteria.core.UniteAdministrativeCriteria;
import ma.sir.crm.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.sir.crm.dao.facade.core.UniteAdministrativeDao;
import ma.sir.crm.dao.facade.history.UniteAdministrativeHistoryDao;
import ma.sir.crm.dao.specification.core.UniteAdministrativeSpecification;
import ma.sir.crm.service.facade.admin.UniteAdministrativeAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class UniteAdministrativeAdminServiceImpl extends AbstractServiceImpl<UniteAdministrative,UniteAdministrativeHistory, UniteAdministrativeCriteria, UniteAdministrativeHistoryCriteria, UniteAdministrativeDao,
UniteAdministrativeHistoryDao> implements UniteAdministrativeAdminService {


    public UniteAdministrative findByReferenceEntity(UniteAdministrative t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(UniteAdministrative.class,UniteAdministrativeHistory.class, UniteAdministrativeHistoryCriteria.class, UniteAdministrativeSpecification.class);
    }


    public UniteAdministrativeAdminServiceImpl(UniteAdministrativeDao dao, UniteAdministrativeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}