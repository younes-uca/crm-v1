package ma.sir.crm.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.crm.zynerator.repository.AbstractRepository;
import ma.sir.crm.bean.core.UniteAdministrative;
import org.springframework.stereotype.Repository;
import ma.sir.crm.bean.core.UniteAdministrative;
import java.util.List;


@Repository
public interface UniteAdministrativeDao extends AbstractRepository<UniteAdministrative,Long>  {
    UniteAdministrative findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW UniteAdministrative(item.id,item.libelle) FROM UniteAdministrative item")
    List<UniteAdministrative> findAllOptimized();
}
