package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.Absence;
import ma.sir.crm.bean.history.AbsenceHistory;
import ma.sir.crm.dao.criteria.core.AbsenceCriteria;
import ma.sir.crm.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.crm.dao.facade.core.AbsenceDao;
import ma.sir.crm.dao.facade.history.AbsenceHistoryDao;
import ma.sir.crm.dao.specification.core.AbsenceSpecification;
import ma.sir.crm.service.facade.admin.AbsenceAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.crm.service.facade.admin.EmployeeAdminService ;
import ma.sir.crm.service.facade.admin.TypeAbsenceAdminService ;


import java.util.List;
@Service
public class AbsenceAdminServiceImpl extends AbstractServiceImpl<Absence,AbsenceHistory, AbsenceCriteria, AbsenceHistoryCriteria, AbsenceDao,
AbsenceHistoryDao> implements AbsenceAdminService {



    public List<Absence> findByTypeAbsenceId(Long id){
        return dao.findByTypeAbsenceId(id);
    }
    public int deleteByTypeAbsenceId(Long id){
        return dao.deleteByTypeAbsenceId(id);
    }
    public List<Absence> findByEmployeeId(Long id){
        return dao.findByEmployeeId(id);
    }
    public int deleteByEmployeeId(Long id){
        return dao.deleteByEmployeeId(id);
    }



    public void configure() {
        super.configure(Absence.class,AbsenceHistory.class, AbsenceHistoryCriteria.class, AbsenceSpecification.class);
    }

    @Autowired
    private EmployeeAdminService employeeService ;
    @Autowired
    private TypeAbsenceAdminService typeAbsenceService ;

    public AbsenceAdminServiceImpl(AbsenceDao dao, AbsenceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}