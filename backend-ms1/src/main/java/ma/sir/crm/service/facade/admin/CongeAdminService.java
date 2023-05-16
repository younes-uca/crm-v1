package ma.sir.crm.service.facade.admin;

import java.util.List;
import ma.sir.crm.bean.core.Conge;
import ma.sir.crm.dao.criteria.core.CongeCriteria;
import ma.sir.crm.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.crm.zynerator.service.IService;


public interface CongeAdminService extends  IService<Conge,CongeCriteria, CongeHistoryCriteria>  {

    List<Conge> findByTypeCongeId(Long id);
    int deleteByTypeCongeId(Long id);
    List<Conge> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);



}
