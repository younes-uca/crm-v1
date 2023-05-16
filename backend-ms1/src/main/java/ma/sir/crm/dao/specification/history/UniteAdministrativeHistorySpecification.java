package  ma.sir.crm.dao.specification.history;

import ma.sir.crm.zynerator.specification.AbstractHistorySpecification;
import ma.sir.crm.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.sir.crm.bean.history.UniteAdministrativeHistory;


public class UniteAdministrativeHistorySpecification extends AbstractHistorySpecification<UniteAdministrativeHistoryCriteria, UniteAdministrativeHistory> {

    public UniteAdministrativeHistorySpecification(UniteAdministrativeHistoryCriteria criteria) {
        super(criteria);
    }

    public UniteAdministrativeHistorySpecification(UniteAdministrativeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
