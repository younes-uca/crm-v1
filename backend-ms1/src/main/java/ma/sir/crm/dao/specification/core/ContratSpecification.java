package  ma.sir.crm.dao.specification.core;

import ma.sir.crm.zynerator.specification.AbstractSpecification;
import ma.sir.crm.dao.criteria.core.ContratCriteria;
import ma.sir.crm.bean.core.Contrat;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ContratSpecification extends  AbstractSpecification<ContratCriteria, Contrat>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("dateContrat", criteria.getDateContrat(), criteria.getDateContratFrom(), criteria.getDateContratTo());
        addPredicateFk("typeContrat","id", criteria.getTypeContrat()==null?null:criteria.getTypeContrat().getId());
        addPredicateFk("typeContrat","id", criteria.getTypeContrats());
        addPredicateFk("typeContrat","code", criteria.getTypeContrat()==null?null:criteria.getTypeContrat().getCode());
    }

    public ContratSpecification(ContratCriteria criteria) {
        super(criteria);
    }

    public ContratSpecification(ContratCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
