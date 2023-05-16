package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.Abonne;
import ma.sir.crm.bean.history.AbonneHistory;
import ma.sir.crm.dao.criteria.core.AbonneCriteria;
import ma.sir.crm.dao.criteria.history.AbonneHistoryCriteria;
import ma.sir.crm.dao.facade.core.AbonneDao;
import ma.sir.crm.dao.facade.history.AbonneHistoryDao;
import ma.sir.crm.dao.specification.core.AbonneSpecification;
import ma.sir.crm.service.facade.admin.AbonneAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AbonneAdminServiceImpl extends AbstractServiceImpl<Abonne,AbonneHistory, AbonneCriteria, AbonneHistoryCriteria, AbonneDao,
AbonneHistoryDao> implements AbonneAdminService {


    public Abonne findByReferenceEntity(Abonne t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Abonne.class,AbonneHistory.class, AbonneHistoryCriteria.class, AbonneSpecification.class);
    }


    public AbonneAdminServiceImpl(AbonneDao dao, AbonneHistoryDao historyDao) {
        super(dao, historyDao);
    }

}