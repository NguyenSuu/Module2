package cms.repository.impl;

import cms.model.Customer;
import cms.repository.CustomerRepository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query=em.createQuery("select c from Customer c",Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findByTd(Long id) {
        TypedQuery<Customer> query=em.createQuery("select c from Customer c where c.id=:id",Customer.class);
        query.setParameter("id",id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e) {
            return null;
        }

    }

    @Override
    public void save(Customer model) {
        if(model.getId()!=null){
            em.merge(model);
        }else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Customer customer=findByTd(id);
        if (customer!=null){
            em.remove(customer);
        }
    }
}