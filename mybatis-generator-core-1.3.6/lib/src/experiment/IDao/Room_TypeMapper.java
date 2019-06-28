package experiment.IDao;

import experiment.domain.Room_Type;
import experiment.domain.Room_TypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Room_TypeMapper {
    long countByExample(Room_TypeExample example);

    int deleteByExample(Room_TypeExample example);

    int deleteByPrimaryKey(Integer roomId);

    int insert(Room_Type record);

    int insertSelective(Room_Type record);

    List<Room_Type> selectByExample(Room_TypeExample example);

    Room_Type selectByPrimaryKey(Integer roomId);

    int updateByExampleSelective(@Param("record") Room_Type record, @Param("example") Room_TypeExample example);

    int updateByExample(@Param("record") Room_Type record, @Param("example") Room_TypeExample example);

    int updateByPrimaryKeySelective(Room_Type record);

    int updateByPrimaryKey(Room_Type record);
}