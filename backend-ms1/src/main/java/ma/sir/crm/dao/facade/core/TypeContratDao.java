package ma.sir.crm.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.crm.zynerator.repository.AbstractRepository;
import ma.sir.crm.bean.core.TypeContrat;
import org.springframework.stereotype.Repository;
import ma.sir.crm.bean.core.TypeContrat;
import java.util.List;


@Repository
public interface TypeContratDao extends AbstractRepository<TypeContrat,Long>  {
    TypeContrat findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeContrat(item.id,item.libelle) FROM TypeContrat item")
    List<TypeContrat> findAllOptimized();
}
