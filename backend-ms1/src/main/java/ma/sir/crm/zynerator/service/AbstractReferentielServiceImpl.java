package ma.sir.crm.zynerator.service;

import ma.sir.crm.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.crm.zynerator.criteria.BaseCriteria;
import ma.sir.crm.zynerator.history.HistBusinessObject;
import ma.sir.crm.zynerator.history.HistCriteria;
import ma.sir.crm.zynerator.repository.AbstractHistoryRepository;
import ma.sir.crm.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}