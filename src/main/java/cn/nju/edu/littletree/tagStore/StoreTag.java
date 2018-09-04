package cn.nju.edu.littletree.tagStore;

import org.springframework.beans.factory.annotation.Autowired;

public class StoreTag {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public List<Student> getList(){
//        String sql = "SELECT ID,NAME,SCORE_SUM,SCORE_AVG, AGE   FROM STUDENT";
//        return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>(){
//
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student stu = new Student();
//                stu.setId(rs.getInt("ID"));
//                stu.setAge(rs.getInt("AGE"));
//                stu.setName(rs.getString("NAME"));
//                stu.setSumScore(rs.getString("SCORE_SUM"));
//                stu.setAvgScore(rs.getString("SCORE_AVG"));
//                return stu;
//            }
//
//        });
//    }
}
