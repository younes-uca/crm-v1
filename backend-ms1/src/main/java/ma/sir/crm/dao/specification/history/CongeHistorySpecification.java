package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.crm.bean.history.CongeHistory;


public class CongeHistorySpecification extends AbstractHistorySpecification<CongeHistoryCriteria, CongeHistory> {

    public CongeHistorySpecification(CongeHistoryCriteria criteria) {
        super(criteria);
    }

    public CongeHistorySpecification(CongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
