package ma.sir.crm.service.facade.admin;

import java.util.List;
import ma.sir.crm.bean.core.Employee;
import ma.sir.crm.dao.criteria.core.EmployeeCriteria;
import ma.sir.crm.dao.criteria.history.EmployeeHistoryCriteria;
import ma.sir.crm.zynerator.service.IService;


public interface EmployeeAdminService extends  IService<Employee,EmployeeCriteria, EmployeeHistoryCriteria>  {

    List<Employee> findByContratId(Long id);
    int deleteByContratId(Long id);
    List<Employee> findByUniteAdministrativeId(Long id);
    int deleteByUniteAdministrativeId(Long id);
    List<Employee> findByCategorieEmployeeId(Long id);
    int deleteByCategorieEmployeeId(Long id);



}
