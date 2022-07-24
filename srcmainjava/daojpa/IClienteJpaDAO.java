package daojpa;

import daogeneric.IGenericJapDAO;
import domain.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
