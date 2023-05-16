package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.Contrat;
import ma.sir.crm.bean.history.ContratHistory;
import ma.sir.crm.dao.criteria.core.ContratCriteria;
import ma.sir.crm.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.crm.dao.facade.core.ContratDao;
import ma.sir.crm.dao.facade.history.ContratHistoryDao;
import ma.sir.crm.dao.specification.core.ContratSpecification;
import ma.sir.crm.service.facade.admin.ContratAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.crm.service.facade.admin.TypeContratAdminService ;


import java.util.List;
@Service
public class ContratAdminServiceImpl extends AbstractServiceImpl<Contrat,ContratHistory, ContratCriteria, ContratHistoryCriteria, ContratDao,
ContratHistoryDao> implements ContratAdminService {


    public Contrat findByReferenceEntity(Contrat t){
        return  dao.findByCode(t.getCode());
    }

    public List<Contrat> findByTypeContratId(Long id){
        return dao.findByTypeContratId(id);
    }
    public int deleteByTypeContratId(Long id){
        return dao.deleteByTypeContratId(id);
    }



    public void configure() {
        super.configure(Contrat.class,ContratHistory.class, ContratHistoryCriteria.class, ContratSpecification.class);
    }

    @Autowired
    private TypeContratAdminService typeContratService ;

    public ContratAdminServiceImpl(ContratDao dao, ContratHistoryDao historyDao) {
        super(dao, historyDao);
    }

}