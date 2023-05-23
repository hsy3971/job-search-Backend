package egovframework.job.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.job.dto.ResumeRegionDTO;
import egovframework.job.vo.ResumeRegionVO;

@Repository
public class ResumeRegionDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 등록
	public int insertResumeRegion(ResumeRegionDTO resumeRegionDTO) {
		return sqlSession.insert("egovframework.mapper.job.ResumeRegionMapper.insertResumeRegion", resumeRegionDTO);
	}
	
	// select
	public List<ResumeRegionVO> selectResumeRegionList (Long r_id) {
		return sqlSession.selectList("egovframework.mapper.job.ResumeRegionMapper.selectResumeRegionByrId",r_id);
	}
	
	// 삭제
	public int deleteResumeRegion(Long region_id) {
		return sqlSession.delete("egovframework.mapper.job.ResumeRegionMapper.deleteResumeRegionByrId",region_id);
		
	}
}
