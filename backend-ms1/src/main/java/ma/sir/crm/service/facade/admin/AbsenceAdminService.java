package ma.sir.crm.service.facade.admin;

import java.util.List;
import ma.sir.crm.bean.core.Absence;
import ma.sir.crm.dao.criteria.core.AbsenceCriteria;
import ma.sir.crm.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.crm.zynerator.service.IService;


public interface AbsenceAdminService extends  IService<Absence,AbsenceCriteria, AbsenceHistoryCriteria>  {

    List<Absence> findByTypeAbsenceId(Long id);
    int deleteByTypeAbsenceId(Long id);
    List<Absence> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);



}
