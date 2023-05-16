package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.EmployeeHistoryCriteria;
import ma.sir.crm.bean.history.EmployeeHistory;


public class EmployeeHistorySpecification extends AbstractHistorySpecification<EmployeeHistoryCriteria, EmployeeHistory> {

    public EmployeeHistorySpecification(EmployeeHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeeHistorySpecification(EmployeeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
