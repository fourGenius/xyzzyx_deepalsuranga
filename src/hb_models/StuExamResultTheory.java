package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuExamResultTheory generated by hbm2java
 */
@Entity
@Table(name="stu_exam_result_theory"
    ,catalog="safenets_ramani"
)
public class StuExamResultTheory  implements java.io.Serializable {


     private Integer idstuExamResultTheory;
     private String stuExamResultTheoryId;
     private String stuUserInfoId;
     private String stuExamResultTheoryName;
     private Double stuExamResultTheoryMark;

    public StuExamResultTheory() {
    }

    public StuExamResultTheory(String stuExamResultTheoryId, String stuUserInfoId, String stuExamResultTheoryName, Double stuExamResultTheoryMark) {
       this.stuExamResultTheoryId = stuExamResultTheoryId;
       this.stuUserInfoId = stuUserInfoId;
       this.stuExamResultTheoryName = stuExamResultTheoryName;
       this.stuExamResultTheoryMark = stuExamResultTheoryMark;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idstu_exam_result_theory", unique=true, nullable=false)
    public Integer getIdstuExamResultTheory() {
        return this.idstuExamResultTheory;
    }
    
    public void setIdstuExamResultTheory(Integer idstuExamResultTheory) {
        this.idstuExamResultTheory = idstuExamResultTheory;
    }

    
    @Column(name="stu_exam_result_theory_id", length=50)
    public String getStuExamResultTheoryId() {
        return this.stuExamResultTheoryId;
    }
    
    public void setStuExamResultTheoryId(String stuExamResultTheoryId) {
        this.stuExamResultTheoryId = stuExamResultTheoryId;
    }

    
    @Column(name="stu_user_info_id", length=50)
    public String getStuUserInfoId() {
        return this.stuUserInfoId;
    }
    
    public void setStuUserInfoId(String stuUserInfoId) {
        this.stuUserInfoId = stuUserInfoId;
    }

    
    @Column(name="stu_exam_result_theory_name")
    public String getStuExamResultTheoryName() {
        return this.stuExamResultTheoryName;
    }
    
    public void setStuExamResultTheoryName(String stuExamResultTheoryName) {
        this.stuExamResultTheoryName = stuExamResultTheoryName;
    }

    
    @Column(name="stu_exam_result_theory_mark", precision=22, scale=0)
    public Double getStuExamResultTheoryMark() {
        return this.stuExamResultTheoryMark;
    }
    
    public void setStuExamResultTheoryMark(Double stuExamResultTheoryMark) {
        this.stuExamResultTheoryMark = stuExamResultTheoryMark;
    }




}

