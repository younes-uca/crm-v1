package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.CategorieEmployeeHistoryCriteria;
import ma.sir.crm.bean.history.CategorieEmployeeHistory;


public class CategorieEmployeeHistorySpecification extends AbstractHistorySpecification<CategorieEmployeeHistoryCriteria, CategorieEmployeeHistory> {

    public CategorieEmployeeHistorySpecification(CategorieEmployeeHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieEmployeeHistorySpecification(CategorieEmployeeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
