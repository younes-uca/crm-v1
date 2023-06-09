package  ma.sir.crm.ws.dto;

import ma.sir.crm.zynerator.audit.Log;
import ma.sir.crm.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class UniteAdministrativeDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;




    public UniteAdministrativeDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }






}
