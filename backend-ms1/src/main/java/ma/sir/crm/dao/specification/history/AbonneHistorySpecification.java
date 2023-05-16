package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.AbonneHistoryCriteria;
import ma.sir.crm.bean.history.AbonneHistory;


public class AbonneHistorySpecification extends AbstractHistorySpecification<AbonneHistoryCriteria, AbonneHistory> {

    public AbonneHistorySpecification(AbonneHistoryCriteria criteria) {
        super(criteria);
    }

    public AbonneHistorySpecification(AbonneHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
