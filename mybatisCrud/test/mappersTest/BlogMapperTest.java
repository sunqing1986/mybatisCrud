package mappersTest;


import com.qf.mybatis.mappers.StudentMapper;
import com.qf.mybatis.pojo.Student;
import com.qf.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class BlogMapperTest { 
	@Test
	public void testSelectByPrimaryKey(){
		SqlSession session = MybatisUtil.getSqlSession();
		StudentMapper studentMapper=session.getMapper(StudentMapper.class);
		
		Student student = studentMapper.selectByPrimaryKey(3);
		System.out.println("hahahha");
		System.out.println(student);
		
		session.commit();
		session.close();
	}
   
}
