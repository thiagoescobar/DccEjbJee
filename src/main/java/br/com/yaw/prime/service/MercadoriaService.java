package br.com.yaw.prime.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.yaw.prime.model.Mercadoria;

@Stateless
public class MercadoriaService extends AbstractPersistence<Mercadoria, Long>{

	@PersistenceContext
    private EntityManager em;
	
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public MercadoriaService() {
		super(Mercadoria.class);
	}
	
	
}
