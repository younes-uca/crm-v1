package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.crm.bean.history.AbsenceHistory;


public class AbsenceHistorySpecification extends AbstractHistorySpecification<AbsenceHistoryCriteria, AbsenceHistory> {

    public AbsenceHistorySpecification(AbsenceHistoryCriteria criteria) {
        super(criteria);
    }

    public AbsenceHistorySpecification(AbsenceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
