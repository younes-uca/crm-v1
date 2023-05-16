package ma.sir.crm.service.impl.admin;

import ma.sir.crm.bean.core.Conge;
import ma.sir.crm.bean.history.CongeHistory;
import ma.sir.crm.dao.criteria.core.CongeCriteria;
import ma.sir.crm.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.crm.dao.facade.core.CongeDao;
import ma.sir.crm.dao.facade.history.CongeHistoryDao;
import ma.sir.crm.dao.specification.core.CongeSpecification;
import ma.sir.crm.service.facade.admin.CongeAdminService;
import ma.sir.crm.zynerator.service.AbstractServiceImpl;
import ma.sir.crm.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.crm.service.facade.admin.EmployeeAdminService ;
import ma.sir.crm.service.facade.admin.TypeCongeAdminService ;


import java.util.List;
@Service
public class CongeAdminServiceImpl extends AbstractServiceImpl<Conge,CongeHistory, CongeCriteria, CongeHistoryCriteria, CongeDao,
CongeHistoryDao> implements CongeAdminService {


    public Conge findByReferenceEntity(Conge t){
        return  dao.findByCode(t.getCode());
    }

    public List<Conge> findByTypeCongeId(Long id){
        return dao.findByTypeCongeId(id);
    }
    public int deleteByTypeCongeId(Long id){
        return dao.deleteByTypeCongeId(id);
    }
    public List<Conge> findByEmployeeId(Long id){
        return dao.findByEmployeeId(id);
    }
    public int deleteByEmployeeId(Long id){
        return dao.deleteByEmployeeId(id);
    }



    public void configure() {
        super.configure(Conge.class,CongeHistory.class, CongeHistoryCriteria.class, CongeSpecification.class);
    }

    @Autowired
    private EmployeeAdminService employeeService ;
    @Autowired
    private TypeCongeAdminService typeCongeService ;

    public CongeAdminServiceImpl(CongeDao dao, CongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}