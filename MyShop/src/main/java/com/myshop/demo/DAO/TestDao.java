package com.myshop.demo.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public Object getCustomerProfileByUserId(Long userId,Long spId) {
		Session session = entityManager.unwrap(Session.class);
		Boolean status = true;
		StringBuffer hql = new StringBuffer(" select u.id as UserId, u.first_name as fName, u.last_name As lName, u.phone as phone , u.user_name AS userName,u.photo as profilePhoto, " + 
				" sp.id AS shopId,sp.address as shopAddress, sp.created_at AS sinceFrom, sp.latitude As lat, sp.longitude as log,sp.shop_name as shopName,sp.no_of_sheets As sheets " + 
				" FROM users As  u " + 
				" join shop_details AS sp On sp.user_id=u.id " + 
				" where u.id=:userId and u.status=:stat ");
		if (spId!=null) {
			hql.append("AND sp.id=:spId");
		}

		SQLQuery query = session.createSQLQuery(hql.toString());
		query.setParameter("userId", userId);
		query.setParameter("stat", true);
		if (spId!=null) {
			query.setParameter("spId", spId);
		}
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		if(query.list()!=null&&query.list().size()>0) {
			return query.list();
		}
		return null;
	}


}
