package com.drawnblue.dao;

import com.drawnblue.entity.UserRefer;
import com.drawnblue.entity.UserReferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserReferMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(String referLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(UserRefer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(UserRefer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<UserRefer> selectByExample(UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    UserRefer selectByPrimaryKey(String referLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserRefer record, @Param("example") UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") UserRefer record, @Param("example") UserReferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(UserRefer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_refer
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(UserRefer record);
}