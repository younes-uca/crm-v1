package ma.sir.crm.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.crm.zynerator.repository.AbstractRepository;
import ma.sir.crm.bean.core.Contrat;
import org.springframework.stereotype.Repository;
import ma.sir.crm.bean.core.Contrat;
import java.util.List;


@Repository
public interface ContratDao extends AbstractRepository<Contrat,Long>  {
    Contrat findByCode(String code);
    int deleteByCode(String code);

    List<Contrat> findByTypeContratId(Long id);
    int deleteByTypeContratId(Long id);

    @Query("SELECT NEW Contrat(item.id,item.code) FROM Contrat item")
    List<Contrat> findAllOptimized();
}
