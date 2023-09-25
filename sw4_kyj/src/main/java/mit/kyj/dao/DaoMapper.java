package mit.kyj.dao;

import java.util.List;

import mit.kyj.vo.Sw4_VO;

public interface DaoMapper {

	// 게시글 목록보기
	List<Sw4_VO> getList();

}
