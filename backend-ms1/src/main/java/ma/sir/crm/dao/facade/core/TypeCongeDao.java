package ma.sir.crm.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.crm.zynerator.repository.AbstractRepository;
import ma.sir.crm.bean.core.TypeConge;
import org.springframework.stereotype.Repository;
import ma.sir.crm.bean.core.TypeConge;
import java.util.List;


@Repository
public interface TypeCongeDao extends AbstractRepository<TypeConge,Long>  {
    TypeConge findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeConge(item.id,item.code) FROM TypeConge item")
    List<TypeConge> findAllOptimized();
}
