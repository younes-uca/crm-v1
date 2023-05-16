package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.TypeContratHistoryCriteria;
import ma.sir.crm.bean.history.TypeContratHistory;


public class TypeContratHistorySpecification extends AbstractHistorySpecification<TypeContratHistoryCriteria, TypeContratHistory> {

    public TypeContratHistorySpecification(TypeContratHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeContratHistorySpecification(TypeContratHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
