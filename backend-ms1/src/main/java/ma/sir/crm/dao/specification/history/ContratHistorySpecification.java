package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.crm.bean.history.ContratHistory;


public class ContratHistorySpecification extends AbstractHistorySpecification<ContratHistoryCriteria, ContratHistory> {

    public ContratHistorySpecification(ContratHistoryCriteria criteria) {
        super(criteria);
    }

    public ContratHistorySpecification(ContratHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
