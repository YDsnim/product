package mit.kyj.mapper;

import java.util.List;

import mit.kyj.domain.Board_VO;

public interface BoardMapper {

	// 게시글 목록보기
	List<Board_VO> getList();

}
