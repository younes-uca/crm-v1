package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.TypeCongeHistoryCriteria;
import ma.sir.crm.bean.history.TypeCongeHistory;


public class TypeCongeHistorySpecification extends AbstractHistorySpecification<TypeCongeHistoryCriteria, TypeCongeHistory> {

    public TypeCongeHistorySpecification(TypeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeCongeHistorySpecification(TypeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
