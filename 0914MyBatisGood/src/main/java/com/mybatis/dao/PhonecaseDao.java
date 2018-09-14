package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mybatis.domain.Phonecase;

//객체를 자동생성해주는 어노테이션
@Repository
public class PhonecaseDao {
			// 동일한 클래스의 bean이 있으면 자동으로 대입해주는 어노테이션
			@Autowired
			private SqlSession sqlSession;
		
			//테이블의 전체 데이터를 가져오는 메소드
			public List<Phonecase> list(){
				return sqlSession.selectList("phonecase.list");
			}

}
