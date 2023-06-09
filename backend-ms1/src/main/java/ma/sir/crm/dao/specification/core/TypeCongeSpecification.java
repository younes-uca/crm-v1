package  ma.sir.crm.dao.specification.core;

import ma.sir.crm.zynerator.specification.AbstractSpecification;
import ma.sir.crm.dao.criteria.core.TypeCongeCriteria;
import ma.sir.crm.bean.core.TypeConge;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeCongeSpecification extends  AbstractSpecification<TypeCongeCriteria, TypeConge>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateBigDecimal("solde", criteria.getSolde(), criteria.getSoldeMin(), criteria.getSoldeMax());
    }

    public TypeCongeSpecification(TypeCongeCriteria criteria) {
        super(criteria);
    }

    public TypeCongeSpecification(TypeCongeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
