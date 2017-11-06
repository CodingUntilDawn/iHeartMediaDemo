package iHeartMediaDemo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component
public class StationService {

    public void insertStation(StationModel stationModel) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();

        try{
            StationModel station = sqlSession.getMapper(StationModel.class);
           // userMapper.insertUser(user);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

}
