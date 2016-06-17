package top.phrack.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.phrack.ctf.pojo.Users;
import top.phrack.ctf.pojo.UsersExample;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int countByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int deleteByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    Users selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByPrimaryKey(Users record);
    
    Users selectByEmail(String email);
    
    Users selectByName(String username);
    
    List<Users> selectUsersForRank();
    
    List<Users> SelectAll();
    
    List<Users> selectAllUsersInTeamByTeamId(Long teamid);
    
}