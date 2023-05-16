package ma.sir.crm.service.facade.admin;

import java.util.List;
import ma.sir.crm.bean.core.Contrat;
import ma.sir.crm.dao.criteria.core.ContratCriteria;
import ma.sir.crm.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.crm.zynerator.service.IService;


public interface ContratAdminService extends  IService<Contrat,ContratCriteria, ContratHistoryCriteria>  {

    List<Contrat> findByTypeContratId(Long id);
    int deleteByTypeContratId(Long id);



}
