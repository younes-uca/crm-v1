package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.TypeAbsenceHistoryCriteria;
import ma.sir.crm.bean.history.TypeAbsenceHistory;


public class TypeAbsenceHistorySpecification extends AbstractHistorySpecification<TypeAbsenceHistoryCriteria, TypeAbsenceHistory> {

    public TypeAbsenceHistorySpecification(TypeAbsenceHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeAbsenceHistorySpecification(TypeAbsenceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
