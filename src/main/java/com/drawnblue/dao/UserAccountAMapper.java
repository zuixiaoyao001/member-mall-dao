package com.drawnblue.dao;

import com.drawnblue.entity.UserAccountA;
import com.drawnblue.entity.UserAccountAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountAMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(UserAccountAExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(UserAccountAExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(String accountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(UserAccountA record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(UserAccountA record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<UserAccountA> selectByExample(UserAccountAExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    UserAccountA selectByPrimaryKey(String accountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserAccountA record, @Param("example") UserAccountAExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") UserAccountA record, @Param("example") UserAccountAExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(UserAccountA record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_201312
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(UserAccountA record);
}