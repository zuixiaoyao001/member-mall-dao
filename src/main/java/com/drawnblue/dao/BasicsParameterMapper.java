package com.drawnblue.dao;

import com.drawnblue.entity.BasicsParameter;
import com.drawnblue.entity.BasicsParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicsParameterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(BasicsParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(BasicsParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(BasicsParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(BasicsParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<BasicsParameter> selectByExample(BasicsParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    BasicsParameter selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") BasicsParameter record, @Param("example") BasicsParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") BasicsParameter record, @Param("example") BasicsParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(BasicsParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basics_parameter
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(BasicsParameter record);
}