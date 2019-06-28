package experiment.IDao;

import experiment.domain.Room_Info;
import experiment.domain.Room_InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Room_InfoMapper {
    long countByExample(Room_InfoExample example);

    int deleteByExample(Room_InfoExample example);

    int deleteByPrimaryKey(Integer infoId);

    int insert(Room_Info record);

    int insertSelective(Room_Info record);

    List<Room_Info> selectByExample(Room_InfoExample example);

    Room_Info selectByPrimaryKey(Integer infoId);

    int updateByExampleSelective(@Param("record") Room_Info record, @Param("example") Room_InfoExample example);

    int updateByExample(@Param("record") Room_Info record, @Param("example") Room_InfoExample example);

    int updateByPrimaryKeySelective(Room_Info record);

    int updateByPrimaryKey(Room_Info record);
}