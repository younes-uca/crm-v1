package ma.sir.crm.service.facade.admin;

import java.util.List;
import ma.sir.crm.bean.core.Pointage;
import ma.sir.crm.dao.criteria.core.PointageCriteria;
import ma.sir.crm.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.crm.zynerator.service.IService;


public interface PointageAdminService extends  IService<Pointage,PointageCriteria, PointageHistoryCriteria>  {

    List<Pointage> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);



}
