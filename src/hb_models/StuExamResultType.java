package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuExamResultType generated by hbm2java
 */
@Entity
@Table(name="stu_exam_result_type"
    ,catalog="safenets_ramani"
)
public class StuExamResultType  implements java.io.Serializable {


     private Integer idstuExamResultType;
     private String stuUserInfoId;
     private String stuExamResultTypeId;

    public StuExamResultType() {
    }

    public StuExamResultType(String stuUserInfoId, String stuExamResultTypeId) {
       this.stuUserInfoId = stuUserInfoId;
       this.stuExamResultTypeId = stuExamResultTypeId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idstu_exam_result_type", unique=true, nullable=false)
    public Integer getIdstuExamResultType() {
        return this.idstuExamResultType;
    }
    
    public void setIdstuExamResultType(Integer idstuExamResultType) {
        this.idstuExamResultType = idstuExamResultType;
    }

    
    @Column(name="stu_user_info_id", length=50)
    public String getStuUserInfoId() {
        return this.stuUserInfoId;
    }
    
    public void setStuUserInfoId(String stuUserInfoId) {
        this.stuUserInfoId = stuUserInfoId;
    }

    
    @Column(name="stu_exam_result_type_id", length=50)
    public String getStuExamResultTypeId() {
        return this.stuExamResultTypeId;
    }
    
    public void setStuExamResultTypeId(String stuExamResultTypeId) {
        this.stuExamResultTypeId = stuExamResultTypeId;
    }




}


