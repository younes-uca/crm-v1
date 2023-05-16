package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.crm.bean.history.PointageHistory;


public class PointageHistorySpecification extends AbstractHistorySpecification<PointageHistoryCriteria, PointageHistory> {

    public PointageHistorySpecification(PointageHistoryCriteria criteria) {
        super(criteria);
    }

    public PointageHistorySpecification(PointageHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
