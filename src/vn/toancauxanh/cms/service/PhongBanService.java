package vn.toancauxanh.cms.service;

import com.querydsl.jpa.impl.JPAQuery;

import vn.toancauxanh.model.PhongBan;
import vn.toancauxanh.service.BasicService;

public class PhongBanService extends BasicService<PhongBan> {

	public JPAQuery<PhongBan> getTargetQuery(){
		JPAQuery<PhongBan> q = find(PhongBan.class);
		return q;
	}
}
