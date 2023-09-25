package mit.kyj.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import mit.kyj.domain.Board_VO;
import mit.kyj.mapper.BoardMapper;

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
@Component //  @Service == @Component
@AllArgsConstructor
//MapperServiceImpl 의 내용 상속받음
public class MapperServiceImpl implements MapperService {
	
	
	private BoardMapper mapper;

	@Override
	public List<Board_VO> getList() {
		log.info("목록보기 요청 받음");
		
		
		return mapper.getList();
	}

}
